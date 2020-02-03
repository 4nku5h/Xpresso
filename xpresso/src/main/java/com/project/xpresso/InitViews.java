package com.project.xpresso;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class InitViews {
    Context context;
    View root;
    public InitViews(Context context,View root){
        this.context=context;
        this.root=root;
    }
    public Button InitButton(int id){
        Button button= root.findViewById(id);
        return button;
    }
    public TextView InitTextView(int id){
        TextView tv= root.findViewById(id);
        return tv;
    }
    public GridView InitGridView(int id){
        GridView gv= root.findViewById(id);
        return gv;
    }
    public ListView InitListView(int id){
        ListView lv= root.findViewById(id);
        return lv;
    }
    public LinearLayout InitLinearLayout(int id){
        LinearLayout ll= root.findViewById(id);
        return ll;
    } public RelativeLayout InitRelativeLayout(int id){
        RelativeLayout rl= root.findViewById(id);
        return rl;
    }
    public TableLayout InitTableLayout(int id){
        TableLayout tl= root.findViewById(id);
        return tl;
    } public ImageView InitImageView(int id){
        ImageView iv= root.findViewById(id);
        return iv;
    }
    public WebView InitWebView(int id){
        WebView wv= root.findViewById(id);
        return wv;
    }


}
