package com.bigcake.rxpermission

import android.Manifest
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.bigcake.R
import com.tbruyelle.rxpermissions2.RxPermissions
import kotlinx.android.synthetic.main.activity_permission.btnCamera

class PermissionActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_permission)

    val rxPermission = RxPermissions(this)
    btnCamera.setOnClickListener {
      rxPermission.request(Manifest.permission.CAMERA)
          .subscribe({ granted ->
            if (granted) {
              Toast.makeText(this, "granted", Toast.LENGTH_SHORT).show()
            } else {
              Toast.makeText(this, "denied", Toast.LENGTH_SHORT).show()
            }
          })
    }
  }
}
