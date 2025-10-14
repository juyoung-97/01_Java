package edu.kh.io.pack2.model.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteService {
	
	/*
	 * 스트림(Stream) : 데이터가 이동하는 통로
	 * 					기본적으로 한 방향으로 흐름
	 * 	
	 * 바이트(Byte)기반 스트림
	 * - 1byte 단위로 데이터를 입 / 출력 하는 스트림
	 * - 최상위 클래스 : InputStream / OutputStream
	 * - 문자열, 이미지, 영상, 오디오, pdf 등
	 * 	모든것을 입 / 출력 할 수 있음
	 * 	(단 , 통로가 좁다보니 속도가 좀 느림, 1byte 초과인 문자같은 경우
	 * 	깨질 우려가 있다)
	 * 
	 * 
	 * */
	
	
	/**
	 * 바이트 기반 스트림을 이용한 파일 출력
	 * + 데이터 출력
	 */
	public void fileByteOutput() {
		
		// FileOutputStream 참조 변수 선언 (OutputStream 상속받은 자식 클래스)
		FileOutputStream fos = null;
		
		try {
			// FileNotFoundException : 경로 상 파일을 찾을 수 없음.
			
			// new FileOutputStream("경로") : 
			// -> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// -> 출력스트림에 연결된 파일이 존재하지 않으면 자동 생성
			// 단, 폴더는 자동생성 해주지 않음 . 
			// 기존 파일이 존재하면 내용을 덮어쓰기함
			
			
			fos = new FileOutputStream("/io_test/20251014/바이트기반_테스트.txt");
			
			// String 의 불변성 문제를 해결한 객체
			// StringBuilder (비동기) / StringBuffer(동기)
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World !!\n");
			sb.append("1234567890\n");
			sb.append("~!@#$%^&*()_+\n");
			sb.append("가나다라마바사아자차카타파하\n");
			sb.append("와자바너무재밌다\n");
			sb.append("선생님 정말 재밌어요 ~ !\n");
			sb.append("진짜로 ~!!!! 재밌다 ~!!! ~\n");
			
			// 출력 방법 1 : 한 글자(2byte)씩 파일로 출력
			// StringBuilder -> String 변환 -> charAt() -> char 변환
			String content = sb.toString(); // StringBuilder -> String 변환
//			
//			for(int i = 0; i < content.length(); i++) {
//				char ch = content.charAt(i); // charAt() 으로 한 글자씩 자르기
//				fos.write(ch);
//			}
			
			// 출력 방법 2 : String 을 byte[] 변환 후 출력
			
			
			// 이전
			// 수행 시간 확인 위한 코드 
			long startTime = System.nanoTime();
			// 	System.nanoTime(); : 1970.01.01 오전 9:00:00 부터
			// 현재 시간까지의 차이를 ns(nano second)로 반환
			
			
			fos.write(content.getBytes()); // byte[] 로 만들어 반환하고
			// 내부적으로 문자 인코딩을 적용하여 한글도 깨지지 않고 출력됨.
			
			// 이후
			long endTime = System.nanoTime();
			
			System.out.println("[수행시간] : " + (endTime - startTime) + "ns");
			// 65000ns
			
			
			fos.flush(); // FileOutputStream 에서는 flush() 선택 사항
			// flush : 스트림 안에 남아있는 모든 데이터를 외부로 모두 밀어냄 
			// 매우 중요 ! ! ! ! ! ! ! ! ! !! ! ! ! !! ! 그냥 쓰자 
			
			System.out.println("출력 완료 !");
			
			
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally { // try 예외 발생 여부 관계 없이 무조건 수행 구간
			// 사용 완료한 스트림을 제거(닫기 , 메모리 반환) 하는 코드 작성
			// -> 메모리 누수 방지
			
			// 스트림이 정상 생성된 경우
			// 스트림을 닫는다
			if(fos != null)
				try {
					fos.close(); // close() 메서드도 IOExeption 을 발생시키기 때문에 try - catch 이용해 예외처리 필수
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		
	}
	
	public void bufferedFileByteOutput() {
		/* 버퍼(Buffer) 란 ?
		 * - 데이터를 모아두는 공간 , 바구니 같은 메모리 공간
		 * 
		 * BufferedOutputStream       / BufferedInputStream
		 * 출력용 보조 스트림(바이트) / 입력용 보조 스트림(바이트)
		 * 
		 * - FileOutputStream 은 1바이트 씩 데이터를 입출력
		 * -> 통로가 좁아서 데이터 입출력 시 속도가 느림
		 * -> 보조스트림 이용 시 버퍼에 입출력할 내용을 모아서 한번에 입출력 ! 
		 * -> 기반 스트림(FileOutputStream)을 이용하는 횟수, 시간이 줄어듬
		 * -> 성능 , 시간 효율 향상
		 * 
		 * 
		 * */
		
		FileOutputStream fos = null; // 기반 스트림 참조변수 선언
		BufferedOutputStream bos = null; // 보조 스트림 참조변수 선언
		
		try {
			
			fos = new FileOutputStream("/io_test/20251014/바이트기반_테스트_buffered.txt");
			
			// 기반 스트림인 fos 를 이용해 보조스트림 bos 를 생성
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World !!\n");
			sb.append("1234567890\n");
			sb.append("~!@#$%^&*()_+\n");
			sb.append("가나다라마바사아자차카타파하\n");
			sb.append("와자바너무재밌다\n");
			sb.append("선생님 정말 재밌어요 ~ !\n");
			sb.append("진짜로 ~!!!! 재밌다 ~!!! ~\n");
			
			// 출력 방법 1 : 한 글자(2byte)씩 파일로 출력
			// StringBuilder -> String 변환 -> charAt() -> char 변환
			String content = sb.toString(); // StringBuilder -> String 변환
//			
//			for(int i = 0; i < content.length(); i++) {
//				char ch = content.charAt(i); // charAt() 으로 한 글자씩 자르기
//				fos.write(ch);
//			}
			
			// 출력 방법 2 : String 을 byte[] 변환 후 출력
			
			
			// 이전
			// 수행 시간 확인 위한 코드 
			long startTime = System.nanoTime();
			// 	System.nanoTime(); : 1970.01.01 오전 9:00:00 부터
			// 현재 시간까지의 차이를 ns(nano second)로 반환
			
			
			bos.write(content.getBytes()); 
			// 버퍼에 저장(파일에 즉시 기록 X)
			// ** BufferedOutputStream 사용시 flush() 반드시 작성
			// 단 close() 시 버퍼에 있는 내용 모두 밀어내고 close 하기때문에
			// close() 있을때는 flush() 선택 사항
			
			// 이후
			long endTime = System.nanoTime();
			
			System.out.println("[수행시간] : " + (endTime - startTime) + "ns");
			// 45000ns
			
			
			bos.flush(); // FileOutputStream 에서는 flush() 선택 사항
			// flush : 스트림 안에 남아있는 모든 데이터를 외부로 모두 밀어냄 
			// 매우 중요 ! ! ! ! ! ! ! ! ! !! ! ! ! !! ! 그냥 쓰자 
			
			System.out.println("출력 완료 !");
			
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				// if 문 작성 시 null 이 아닐때를 따지는 이유
				// 스트림 객체 미 생성시 close() 구간에서
				// NullPointerException 발생 우려가 있음
				// -> 예외 처리
				if(bos != null) bos.close();
				// 보조스트림(bos) close() 시
				// 보조스트림 생성에 사용된 기반스트림(fos)도 같이 close() 됨
				// close() 시 버퍼에 남아있는 내용 모두 flush() 함.
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}
	
}
