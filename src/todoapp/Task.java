/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todoapp;



/**
 *
 * @author julia
 */
class Task {
    private String Title;
    private String Description;
    private String FinishDate;
    
    public Task(String Title, String Description, String FinishDate)
    {
        this.Title = Title;
        this.Description = Description;
        this.FinishDate = FinishDate;
        
    }
    public String getTitle() {
        return Title;
    }


    public String getDescription() {
        return Description;
    }

    public String getFinishDate() {
        return FinishDate;
    }

  
    
}
