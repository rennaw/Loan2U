package loan2u.dw.loanmanager;

/**
 * Created by Owner on 4/28/2014.
 */
import android.net.Uri;

/**
 * Created by Johnny Manson on 23.07.13.
 */
public class Contact {

    private String _name, _phone, _email, _item;
    private Uri _imageURI;
    private int _id;

    public Contact(int id, String name, String phone, String email, String item) {
        _id = id;
        _name = name;
        _phone = phone;
        _email = email;
        _item = item;
//        _imageURI = imageURI;
    }

    public int getId() { return _id; }

    public String getName() {
        return _name;
    }

    public String getPhone() {
        return _phone;
    }

    public String getEmail() {
        return _email;
    }

    public String getItem() {
        return _item;
    }

//    public Uri getImageURI() { return _imageURI; }
}
