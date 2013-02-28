package org.graphwalker.examples.modelAPI;

import java.io.File;

import org.apache.log4j.Logger;
import org.graphwalker.Util;
import org.graphwalker.generators.PathGenerator;

public class Amazon extends org.graphwalker.multipleModels.ModelAPI {
  private static Logger logger = Util.setupLogger(Amazon.class);

  public Amazon(File model, boolean efsm, PathGenerator generator, boolean weight) {
    super(model, efsm, generator, weight);
  }


  /**
   * This method implements the Edge 'e_AddBookToCart'
   * 
   *         
   *       
   */
  public void e_AddBookToCart() {
  }


  /**
   * This method implements the Edge 'e_ClickBook'
   * 
   *         
   *       
   */
  public void e_ClickBook() {
  }


  /**
   * This method implements the Edge 'e_EnterBaseURL'
   * 
   *         
   *       
   */
  public void e_EnterBaseURL() {
  }


  /**
   * This method implements the Edge 'e_SearchBook'
   * 
   *         
   *       
   */
  public void e_SearchBook() {
  }


  /**
   * This method implements the Edge 'e_ShoppingCart'
   * 
   *         
   *       
   */
  public void e_ShoppingCart() {
  }


  /**
   * This method implements the Edge 'e_StartBrowser'
   * 
   *         
   *       
   */
  public void e_StartBrowser() {
  }


  /**
   * This method implements the Vertex 'v_BaseURL'
   * Verify that Amazon's home page is properly displayed.
   */
  public void v_BaseURL() {
  }


  /**
   * This method implements the Vertex 'v_BookInformation'
   * Verify that the page displaing detailed information regarding '
   * Practical Model-Based Testing: A Tools Approach' is correct.
   */
  public void v_BookInformation() {
  }


  /**
   * This method implements the Vertex 'v_BrowserStarted'
   * Verify that the web browser is upp running. 
   */
  public void v_BrowserStarted() {
  }


  /**
   * This method implements the Vertex 'v_OtherBoughtBooks'
   * Verify that the page 'Shopping Cart' now displays information 'Customers Who Bought Practical Model-Based Testing: A Tools Approach Also Bought'
   */
  public void v_OtherBoughtBooks() {
  }


  /**
   * This method implements the Vertex 'v_SearchResult'
   * Verify that in the search result list, the book 'Practical Model-Based Testing: A Tools Approach by Mark Utting and Bruno Legeard' exists.
   */
  public void v_SearchResult() {
  }


  /**
   * This method implements the Vertex 'v_ShoppingCart'
   * Verify that the shopping cart page is displayed properly. The correct amount of added books should be: {$num_of_books}
   */
  public void v_ShoppingCart() {
  }


}
