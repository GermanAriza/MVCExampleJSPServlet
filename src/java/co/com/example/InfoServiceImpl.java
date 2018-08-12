/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author PC-49
 */
@ApplicationScoped
public class InfoServiceImpl implements InfoService {

    @Override
    public String calculateServerName() {
        return "TEST SERVER";
    }

    @Override
    public String calculateServerMemory() {
        return formatBytes(Runtime.getRuntime().freeMemory());
    }

    @Override
    public String calculateServerfreeMemory() {
        return formatBytes(Runtime.getRuntime().freeMemory());
    }

    @Override
    public String calculateServerCores() {
        return Integer.toString(Runtime.getRuntime().availableProcessors());
    }

    @Override
    public String calculateServerTime() {
        return new SimpleDateFormat().format(new Date());
    }

    private String formatBytes(long bytes) {
        if (bytes < 1024) {
            return bytes + "B";
        }
        if (bytes < 1024 * 1024) {
            return (bytes / 1024) + "MB";
        }
        return (bytes / (1024 * 1024)) + "MB";
    }

}
