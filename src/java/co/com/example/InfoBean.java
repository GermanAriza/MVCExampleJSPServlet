/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.example;

/**
 *
 * @author PC-49
 */
public class InfoBean {

    private String serverMemory;
    private String serverFreeMemory;
    private String serverName;
    private String serverCores;
    private String serverTime;

    public InfoBean() {

    }

    /**
     * @return the serverMemory
     */
    public String getServerMemory() {
        return serverMemory;
    }

    /**
     * @param serverMemory the serverMemory to set
     */
    public void setServerMemory(String serverMemory) {
        this.serverMemory = serverMemory;
    }

    /**
     * @return the serverFreeMemory
     */
    public String getServerFreeMemory() {
        return serverFreeMemory;
    }

    /**
     * @param serverFreeMemory the serverFreeMemory to set
     */
    public void setServerFreeMemory(String serverFreeMemory) {
        this.serverFreeMemory = serverFreeMemory;
    }

    /**
     * @return the serverName
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * @param serverName the serverName to set
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * @return the serverCores
     */
    public String getServerCores() {
        return serverCores;
    }

    /**
     * @param serverCores the serverCores to set
     */
    public void setServerCores(String serverCores) {
        this.serverCores = serverCores;
    }

    /**
     * @return the serverTime
     */
    public String getServerTime() {
        return serverTime;
    }

    /**
     * @param serverTime the serverTime to set
     */
    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

}
