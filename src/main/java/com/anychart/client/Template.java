package com.anychart.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Template implements EntryPoint {

    Logger logger = Logger.getLogger("AnyChart GWT Template");

    public void onModuleLoad() {
        logger.log(Level.INFO, "GWT module load!");
        getFruitsData();
    }

    // retrieve json data from server
    private void getFruitsData(){
        String url = "/fruits";
        url = URL.encode(url);
        RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, url);
        try{
            Request request = builder.sendRequest(null, new RequestCallback() {
                @Override
                public void onResponseReceived(Request request, Response response) {
                    if (response.getStatusCode() == 200) {
                        logger.log(Level.INFO, "Get json data!");
                        // set chart with received data
                        initChart(response.getText());
                    } else {
                        logger.log(Level.SEVERE, "Couldn't retrieve JSON");
                    }
                }
                @Override
                public void onError(Request request, Throwable throwable) {
                    logger.log(Level.SEVERE, "Couldn't retrieve JSON");
                }
            });
        }catch (RequestException e){
            logger.log(Level.SEVERE, "Couldn't retrieve JSON");
        }
    }

    // init chart with data from server
    public native void initChart(String chartData) /*-{
        $wnd.anychart.onDocumentReady(function () {
            // call functions only after document ready.
            chart = $wnd.anychart.pie(JSON.parse(chartData));
            chart.title("Top 5 fruits");
            chart.container('container');
            chart.draw();
        });
    }-*/;

}
