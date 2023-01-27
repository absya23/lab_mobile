package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    TextView tvHello;

    Employee employee=null;
    Dish dish =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




//           --------- bai 1
//        setContentView(R.layout.lab2_bai1);
//
//        ListView lvPerson = (ListView) findViewById(R.id.lv_person);
//        TextView tvSelection = (TextView) findViewById(R.id.tv_selection);
//        final String arr[] = {"Teo", "Ty", "Son", "Bo"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
//        lvPerson.setAdapter(adapter);
//        lvPerson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.M)
//            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
////                arg0.setBackgroundColor(getColor(R.color. white));
////                arg1.setBackgroundColor(getColor(R.color. color6));
//                //đối số arg2 là vị trí phần tử trong Data Source (arr)
//                tvSelection.setText("position :" + arg2 + " ; value =" + arr[arg2]);
//            }
//        });
//

//        ----------- bai 2
//        setContentView(R.layout.lab2_bai2);
//        Button btnSubmit = (Button) findViewById(R.id.btn_nhap);
//        EditText etName = (EditText) findViewById(R.id.et_name);
//        ListView lvPerson = (ListView) findViewById(R.id.lv_person);
//        TextView tvSelection = (TextView) findViewById(R.id.tv_selection);
//        //1. Tạo ArrayList object
//        ArrayList names = new ArrayList<String>();
//        //2. Gán Data Source (ArrayList object) vào
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
//        //3. gán Adapter vào ListView
//        lvPerson.setAdapter(adapter);
//        //4. Xử lý sự kiện nhấn nút Nhập
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                //Log.v("EditText", etName.getText().toString());
//                //Thêm dữ liệu mới vào arraylist
//                names.add(etName.getText().toString());
//                //Cập nhật dữ liệu mới lên giao diên
//                adapter.notifyDataSetChanged();
//            }
//        });
//        //5. Xử lý sự kiện chọn một phần tử trong ListView
//        lvPerson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
//                tvSelection.setText("position : "+ arg2+ "; value ="+ names.get(arg2));
//            }
//        });
//        //6. xử lý sự kiện Long click
//        lvPerson.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//                names.remove(arg2);//xóa phần tử thứ arg2
//                adapter.notifyDataSetChanged();
//                return false;
//            }
//        });


        //------- bai 3

//        setContentView(R.layout.lab2_bai3);
//
//
//        EditText etId = (EditText) findViewById(R.id.et_manv);
//        EditText etName = (EditText) findViewById(R.id.et_name);
//        Button btnSubmit = (Button) findViewById(R.id.btn_nhap);
//        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
//        ListView lvNhanvien = (ListView) findViewById(R.id.lv_person);
//        ArrayList<Employee> arrNV = new ArrayList<Employee>();
//        //đưa Data Source là các employee vào Adapter
//        ArrayAdapter<Employee> adapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, arrNV);
//        //đưa adapter vào ListView
//        lvNhanvien.setAdapter(adapter);
//
//
//
//        btnSubmit.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View arg0) {
//                //Lấy ra đúng id của Radio Button được checked
//                int radId = radioGroup.getCheckedRadioButtonId();
//                String id = etId.getText() + "";
//                String name = etName.getText() + "";
//                if (radId == R.id.radChinhthuc) {
//                    //tạo instance là FullTime
//                    employee = new EmployeeFullTime();
//                } else {
//                    //Tạo instance là Partime
//                    employee = new EmployeePartTime();
//                }
//                employee.setId(id);
//                employee.setName(name);
//                //Đưa employee vào ArrayList
//                arrNV.add(employee);
//                //Cập nhập giao diện
//                adapter.notifyDataSetChanged();
//                    etId.setText("");
//                    etName.setText("");
//                    etId.requestFocus();
//            }
//        });


        //--------- bai 4

//        setContentView(R.layout.lab2_bai4);
//        ArrayList<Employee>arrEmployee=new ArrayList<Employee>();
//        EmployeeAdapter adapter= new EmployeeAdapter(this, R.layout.item_employee, arrEmployee);
//        EditText et_id = (EditText) findViewById(R.id.et_manv);
//        EditText et_name = (EditText) findViewById(R.id.et_name);
//        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_id);
//        Button btnNhap = (Button) findViewById(R.id.btn_nhap);
//        ListView lvNhanvien = (ListView) findViewById(R.id.lv_person);
//        lvNhanvien.setAdapter(adapter);//gán Adapter vào Lisview;
//        btnNhap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//                String ma=et_id.getText()+"";
//                String ten=et_name.getText()+"";
//                //Tạo một employee, dùng tạm EmployeeFullTime tại vì employee đang là lớp abstract
//                employee = new EmployeeFullTime();
//                employee.setId(ma);
//                employee.setName(ten);
//                employee.setManager(checkBox.isChecked());
//                //Đưa vào danh sách
//                arrEmployee.add(employee);
//                //gọi hàm cập nhật giao diện
//                adapter.notifyDataSetChanged();
//                //Sau khi update thì xóa trắng dữ liệu và cho editma focus
//                et_id.setText("");
//                et_name.setText("");
//                et_id.requestFocus();
//            }
//        });



        //-------- bai 5
//        setContentView(R.layout.lab2_bai5);
//        Spinner sp_thumbnail = (Spinner) findViewById(R.id.sp_thumbnail);
//        sp_thumbnail.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
//                Thumbnail item = Thumbnail.values()[position];
//                switch (item) {
//                    case ThumbnailL1:
//                        Log.v("MyActivity","Selected item :"+item);
//                        break;
//                    case ThumbnailL2:
//                        Log.v("MyActivity","Selected item :"+item);
//                        break;
//                    case ThumbnailL3:
//                        Log.v("MyActivity","Selected item :"+item);
//                        break;
//                    case ThumbnailL4:
//                        Log.v("MyActivity","Selected item :"+item);
//                        break;
//                }
//            }
//            @Override
//            public void onNothingSelected(AdapterView adapterView) {
//
//            }
//        });
//        ThumbnailAdapter<Thumbnail> customAdapter=new ThumbnailAdapter<Thumbnail>(this,R.layout.item_thumbnail,Thumbnail.values());
//        sp_thumbnail.setAdapter(customAdapter);
//
//        ArrayList<Dish> arrDish=new ArrayList<Dish>();
//        DishAdapter adapter= new DishAdapter(this, R.layout.item_dish, arrDish);
//
//        EditText et_name = (EditText) findViewById(R.id.et_name);
//        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_id);
////        Spinner sp_thumbnail = (Spinner) findViewById(R.id.sp_thumbnail);
////        ten thumbnail
////        String text = sp_thumbnail.getSelectedItem().toString();
////        Object i = sp_thumbnail.getSelectedItem();
////        Log.v("ád", ""+i);
//
//        Button btnNhap = (Button) findViewById(R.id.btn_nhap);
//
//        GridView gvFood = (GridView) findViewById(R.id.gridView);
//        gvFood.setAdapter(adapter);
//
//        btnNhap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//                String text = sp_thumbnail.getSelectedItem().toString();
//                Integer img = Thumbnail.valueOf(text).getImg();
//                String ten=et_name.getText().toString().trim();
//                //Tạo một dish
//                dish = new Dish();
//                dish.setName(ten);
//                // chưa set ảnh được
//                dish.setImg(img);
//                dish.setPromotion(checkBox.isChecked());
//                //Đưa vào danh sách
//                arrDish.add(dish);
//                //gọi hàm cập nhật giao diện
//                adapter.notifyDataSetChanged();
//                //Sau khi update thì xóa trắng dữ liệu và cho focus
//                et_name.setText("");
//                checkBox.setChecked(false);
//                et_name.requestFocus();
//                sp_thumbnail.setSelection(0);
//
//
//                Toast.makeText(getApplicationContext(),"Added successfully!", Toast.LENGTH_LONG).show();
//            }
//
//        });







        //----------------- bai 6
        setContentView(R.layout.lab2_bai6);
        RecyclerView recyclerView = findViewById(R.id.lv_person);
        ArrayList<Employee> arrEmployee = new ArrayList<Employee>();

        EmployeeAdapterR adapter = new EmployeeAdapterR(this, arrEmployee);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


        EditText et_id = (EditText) findViewById(R.id.et_manv);
        EditText et_name = (EditText) findViewById(R.id.et_name);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_id);
        Button btnNhap = (Button) findViewById(R.id.btn_nhap);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String ma=et_id.getText()+"";
                String ten=et_name.getText()+"";
                //Tạo một employee, dùng tạm EmployeeFullTime tại vì employee đang là lớp abstract
                employee = new EmployeeFullTime();
                employee.setId(ma);
                employee.setName(ten);
                employee.setManager(checkBox.isChecked());
                //Đưa vào danh sách
                arrEmployee.add(employee);
                //gọi hàm cập nhật giao diện
                adapter.notifyDataSetChanged();

                //Sau khi update thì xóa trắng dữ liệu và cho editma focus
                et_id.setText("");
                et_name.setText("");
                checkBox.setChecked(false);
                et_id.requestFocus();
            }
        });



    }

}




