/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observed;

/**
 *
 * @author tailon.prado
 */
public class Observed {

    public static void main(String[] args) {
        
        DataSource dataSource = new DataSource();
        StockListView list1 = new StockListView(dataSource);
        StockListView list2 = new StockListView(dataSource);
        StockListView list3 = new StockListView(dataSource);
        StockListView list4 = new StockListView(dataSource);
        StatusBar statusBar = new StatusBar(dataSource);
        dataSource.addObserver(list1);
        dataSource.addObserver(list2);
        dataSource.addObserver(list3);
        dataSource.addObserver(list4);
        dataSource.addObserver(statusBar);
        dataSource.setValue(35);
    }
}
