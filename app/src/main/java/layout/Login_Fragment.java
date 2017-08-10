package layout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import shoaibhassan.login_activity.MainActivity;
import shoaibhassan.login_activity.R;
public class Login_Fragment extends Fragment {

    public Login_Fragment() {
        // Required empty public constructor
    }
EditText u,p;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login_, container, false);

        Button button = (Button) v.findViewById(R.id.button);
        u=(EditText)v.findViewById(R.id.editText);
        p=(EditText)v.findViewById(R.id.editText3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(u.equals("shoaib")&&p.equals("123"))
                {
                  Toast.makeText(getActivity(),"match password",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getActivity(),"match not password",Toast.LENGTH_LONG).show();
                }
            }
        });
        return v;
    }

}