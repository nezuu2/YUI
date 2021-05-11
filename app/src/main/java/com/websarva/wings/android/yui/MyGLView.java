package com.websarva.wings.android.yui;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLView extends GLSurfaceView {
    MyRenderer myRenderer;

    public MyGLView(Context context) {
        super(context);
        myRenderer = new MyRenderer();
        setRenderer(myRenderer);
    }

    void SetView() {
        //初期描画
    }
}
