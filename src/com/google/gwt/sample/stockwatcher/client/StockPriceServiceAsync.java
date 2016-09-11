package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface StockPriceServiceAsync {
	void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback) throws IllegalArgumentException;
}
