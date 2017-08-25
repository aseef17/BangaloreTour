package com.example.aseef.tour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class ItemAdapter extends ArrayAdapter<item> {

    public ItemAdapter(Context context,ArrayList<item> items){

        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final item currentItem = getItem(position);

        //Fill the views (in item.xml) with content

        TextView headerTextView = (TextView) listItemView.findViewById(R.id.header_text_view);
        headerTextView.setText(currentItem.getHeaderTextId());

        TextView phoneNumberTextView = (TextView) listItemView.findViewById(R.id.phone_number_text_view);

        if (currentItem.hasNumber()) {
            // If an image is available, display the provided image based on the resource ID
            phoneNumberTextView.setText(currentItem.getPhoneNumberId());
            // Make sure the view is visible
            phoneNumberTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            phoneNumberTextView.setVisibility(View.GONE);
        }

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentItem.getAddressId());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentItem.getDescriptionTextId());

        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website_text_view);

        if (currentItem.hasWebsite()) {
            // If an image is available, display the provided image based on the resource ID
            websiteTextView.setText(currentItem.getWebsiteTextId());
            // Make sure the view is visible
            websiteTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            websiteTextView.setVisibility(View.GONE);
        }

        final ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentItem.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);

        ImageView imageView1 = (ImageView) listItemView.findViewById(R.id.phone_ic);
        imageView1.setImageResource(currentItem.getPhoneId());
        imageView.setVisibility(View.VISIBLE);

        ImageView imageView2 = (ImageView) listItemView.findViewById(R.id.map_ic);
        imageView2.setImageResource(currentItem.getMapId());
        imageView.setVisibility(View.VISIBLE);

        ImageView imageView3 = (ImageView) listItemView.findViewById(R.id.http_ic);
        imageView3.setImageResource(currentItem.getLinkId());
        imageView.setVisibility(View.VISIBLE);

        // Create OnClickListeners for DIALER and MAPS intents
        // Get the input parameters for the them

        //for DIALER
        phoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt = (TextView) view;
                String currentPhoneNumber = txt.getText().toString();
                dial(currentPhoneNumber);
            }
        });

        //for MAPS
        addressTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt2 = (TextView) view;
                String currentAddress = txt2.getText().toString()+"Bangalore,Karnataka";
                navigate(currentAddress);
            }
        });
        return listItemView;
    }

    // Set up an intent to dial the  phone number of the place
    private void dial(String currentPhoneNumber) {
        Uri number = Uri.parse("tel:" + currentPhoneNumber);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        callIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getContext().startActivity(callIntent);
    }

    //Set up an intent to start maps and navigate to the place
    private void navigate(String currentAddress) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?").buildUpon()
                .appendQueryParameter("q", currentAddress)
                .build();
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(gmmIntentUri);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getContext().startActivity(mapIntent);
    }




}
