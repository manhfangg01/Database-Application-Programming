package assignment1;


public class Member extends Customer {
    private String memberCode;

    public Member(String name, String email, String phoneNumber, String memberCode) {
        super(name, email, phoneNumber);
        this.memberCode = memberCode;
    }


    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }
}
