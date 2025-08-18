package collection.set.member;

import javax.swing.plaf.PanelUI;

public class MemberOnlyHash {

    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
            "id='" + id + '\'' +
            '}';
    }
}
