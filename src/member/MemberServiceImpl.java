package member;

import java.util.*;

public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl instance = null;
	private MemberServiceImpl() {}			// 기본생성자

	public static MemberServiceImpl getInstance() {
		if (instance == null)
			instance = new MemberServiceImpl();
		return instance;
	}

	Scanner sc = new Scanner(System.in);

	ArrayList<MemberDTO> arr = new ArrayList<>();

	@Override
	public void membersave() {
		boolean bool = true;

		while(bool) {
			MemberDTO dto = new MemberDTO();
			System.out.println("저장할 id 입력 : ");
			dto.setId(sc.next());
			System.out.println("저장할 pwd 입력 : ");
			dto.setPwd(sc.next());
			System.out.println("저장할 회원이름 입력 : ");
			dto.setName(sc.next());

			boolean flag = false;
			for(int i = 0; i < arr.size(); i++ ) {
				if (arr.get(i).getId().equals(dto.getId()))
				{
					System.out.println("중복된 아이디가 있습니다.");
					flag = true;
					break;
				}
			}
			if (flag == false) {
				arr.add(dto);
			}

			System.out.println("등록그만하기 0번");
			if(sc.nextInt() == 0) bool = false;
		}
	}

	@Override
	public void membernum() {

		System.out.println("현재 총 등록된 회원 수는 " + arr.size());
	}
}