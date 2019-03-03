package com.example.akashkumar.menuitems;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Menu extends Fragment {
    List<FireModal> list;
    RecyclerView recycle;
    RecyclerAdapter recyclerAdapter;
    public Menu() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_menu,container,false); {

            recycle = (RecyclerView) view.findViewById(R.id.recycle);

            RecyclerView.LayoutManager recyce = new GridLayoutManager(getActivity(),3);
            /// RecyclerView.LayoutManager recyce = new LinearLayoutManager(MainActivity.this);
            // recycle.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
            recycle.setLayoutManager(recyce);
            recycle.setItemAnimator( new DefaultItemAnimator());
            loadRestaurants();



            // Inflate the layout for this fragment
            return view;

        }



    }

    public void loadRestaurants(){

        list = new ArrayList<FireModal>();
        FireModal fireModal=new FireModal("akash");
        FireModal fireModa2=new FireModal("akash");
        FireModal fireModa3=new FireModal("akash");
        FireModal fireModa4=new FireModal("akash");
        FireModal fireModa5=new FireModal("akash");
        FireModal fireModa6=new FireModal("akash");

        FireModal fireModa7=new FireModal("akash");
        FireModal fireModa8=new FireModal("akash");
        FireModal fireModa9=new FireModal("akash");
        FireModal fireModa10=new FireModal("akash");
        FireModal fireModa11=new FireModal("akash");
        FireModal fireModal2=new FireModal("akash");

        FireModal fireModal3=new FireModal("akash");
        FireModal fireModal4=new FireModal("akash");
        FireModal fireModal5=new FireModal("akash");
        FireModal fireModal6=new FireModal("akash");
        FireModal fireModal7=new FireModal("akash");
        FireModal fireModal8=new FireModal("akash");

        list.add(fireModal);
        list.add(fireModa2);
        list.add(fireModa4);
        list.add(fireModa3);
        list.add(fireModa5);
        list.add(fireModa6);
        list.add(fireModa7);
        list.add(fireModa8);
        list.add(fireModa9);
        list.add(fireModa11);
        list.add(fireModal2);
        list.add(fireModal3);
        list.add(fireModal4);
        list.add(fireModal5);
        list.add(fireModal6);

        recyclerAdapter = new RecyclerAdapter(list,getActivity());
        recycle.setAdapter(recyclerAdapter);
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//
//                list = new ArrayList<FireModal>();
//                for(DataSnapshot dataSnapshot1 :dataSnapshot.getChildren()){
//                    FireModal value = dataSnapshot1.getValue(FireModal.class);
////                    FireModal fire = new FireModal();
////                    String name = value.getName();
////                    String address = value.getAddress();
////                    String email = value.getEmail();
////                    fire.setName(name);
////                    fire.setEmail(email);
////                    fire.setAddress(address);
//                    list.add(value);
//
//                }
//                recyclerAdapter = new RecyclerAdapter(list,getActivity());
//                recycle.setAdapter(recyclerAdapter);

    }
}