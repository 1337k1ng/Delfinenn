public class Member {

    String name;
    String activity;
    String gender;
    int age;



    public Member(String name, String activity, String gender, int age) {
        this.name = name;
        this.activity = activity;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "Name: " + name + " Activity: " + activity + " Gender: " + gender + " Age: " + age;
    }
}


