/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.math.pro.ak.util.cognito;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderAsync;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderAsyncClientBuilder;
import com.math.pro.ak.util.Config;
import java.util.Properties;

/**
 *
 * @author marcus
 */
public class CognitoUtil {

    public static String CLIENT_ID;
    public static String CLIENT_SECRET;
    private static AWSCognitoIdentityProviderAsync cognito;

    public static AWSCognitoIdentityProviderAsync getInstance() {
        synchronized (CognitoUtil.class) {
            if (cognito == null) {
                try {
                    Properties properties = Config.readConfig();
                    if (properties.getProperty("runtime").equals("[prod]")) {
                        cognito = AWSCognitoIdentityProviderAsyncClientBuilder.standard()
                                .withRegion(Regions.US_EAST_2)
                                .withClientConfiguration(new ClientConfiguration().withRequestTimeout(5000))
                                .withCredentials(new ProfileCredentialsProvider("devProfile"))
                                .build();
                        CLIENT_ID = "6eksqgodrqh2ag81ecoq4u6uhp";
                        CLIENT_SECRET = "17qke2ort8kuhb54fkmbhps1aj4m0gc5j1km9de61numk69qk0fs";
                    } else {
                        cognito = AWSCognitoIdentityProviderAsyncClientBuilder.standard()
                                .withRegion(Regions.US_EAST_2)
                                .withClientConfiguration(new ClientConfiguration().withRequestTimeout(5000))
                                .withCredentials(new ProfileCredentialsProvider("devProfile"))
                                .build();
                        CLIENT_ID = "6eksqgodrqh2ag81ecoq4u6uhp";
                        CLIENT_SECRET = "17qke2ort8kuhb54fkmbhps1aj4m0gc5j1km9de61numk69qk0fs";
                    }
                } catch (RuntimeException ex) {
                    throw ex;
                }
            }
        }
        return cognito;
    }
}
