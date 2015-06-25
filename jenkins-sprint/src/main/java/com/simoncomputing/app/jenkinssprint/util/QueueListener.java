package com.simoncomputing.app.jenkinssprint.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.simoncomputing.app.jenkinssprint.domain.Entry;

/**
 * Application Lifecycle Listener implementation class QueueListener
 *
 */
@WebListener
public class QueueListener implements ServletContextListener {
	
	private static Queue<Entry> queue; 
    /**
     * Default constructor. 
     */
    public QueueListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	queue = new Queue<Entry>(); 
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }
    
    public static Queue<Entry> getQueue() {
    	return queue; 
    }
	
}
