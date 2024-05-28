/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.chatbot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateAccountPreferences" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountPreferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Enables use of a user role requirement in your chat configuration. */
    private Boolean userAuthorizationRequired;
    /**
     * Turns on training data collection. This helps improve the AWS Chatbot experience by allowing AWS Chatbot to store
     * and use your customer information, such as AWS Chatbot configurations, notifications, user inputs, AWS Chatbot
     * generated responses, and interaction data. This data helps us to continuously improve and develop Artificial
     * Intelligence (AI) technologies. Your data is not shared with any third parties and is protected using
     * sophisticated controls to prevent unauthorized access and misuse. AWS Chatbot does not store or use interactions
     * in chat channels with Amazon Q for training AWS Chatbot’s AI technologies.
     */
    private Boolean trainingDataCollectionEnabled;

    /**
     * Enables use of a user role requirement in your chat configuration.
     * 
     * @param userAuthorizationRequired
     *        Enables use of a user role requirement in your chat configuration.
     */

    public void setUserAuthorizationRequired(Boolean userAuthorizationRequired) {
        this.userAuthorizationRequired = userAuthorizationRequired;
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     * 
     * @return Enables use of a user role requirement in your chat configuration.
     */

    public Boolean getUserAuthorizationRequired() {
        return this.userAuthorizationRequired;
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     * 
     * @param userAuthorizationRequired
     *        Enables use of a user role requirement in your chat configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPreferencesRequest withUserAuthorizationRequired(Boolean userAuthorizationRequired) {
        setUserAuthorizationRequired(userAuthorizationRequired);
        return this;
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     * 
     * @return Enables use of a user role requirement in your chat configuration.
     */

    public Boolean isUserAuthorizationRequired() {
        return this.userAuthorizationRequired;
    }

    /**
     * Turns on training data collection. This helps improve the AWS Chatbot experience by allowing AWS Chatbot to store
     * and use your customer information, such as AWS Chatbot configurations, notifications, user inputs, AWS Chatbot
     * generated responses, and interaction data. This data helps us to continuously improve and develop Artificial
     * Intelligence (AI) technologies. Your data is not shared with any third parties and is protected using
     * sophisticated controls to prevent unauthorized access and misuse. AWS Chatbot does not store or use interactions
     * in chat channels with Amazon Q for training AWS Chatbot’s AI technologies.
     * 
     * @param trainingDataCollectionEnabled
     *        Turns on training data collection. This helps improve the AWS Chatbot experience by allowing AWS Chatbot
     *        to store and use your customer information, such as AWS Chatbot configurations, notifications, user
     *        inputs, AWS Chatbot generated responses, and interaction data. This data helps us to continuously improve
     *        and develop Artificial Intelligence (AI) technologies. Your data is not shared with any third parties and
     *        is protected using sophisticated controls to prevent unauthorized access and misuse. AWS Chatbot does not
     *        store or use interactions in chat channels with Amazon Q for training AWS Chatbot’s AI technologies.
     */

    public void setTrainingDataCollectionEnabled(Boolean trainingDataCollectionEnabled) {
        this.trainingDataCollectionEnabled = trainingDataCollectionEnabled;
    }

    /**
     * Turns on training data collection. This helps improve the AWS Chatbot experience by allowing AWS Chatbot to store
     * and use your customer information, such as AWS Chatbot configurations, notifications, user inputs, AWS Chatbot
     * generated responses, and interaction data. This data helps us to continuously improve and develop Artificial
     * Intelligence (AI) technologies. Your data is not shared with any third parties and is protected using
     * sophisticated controls to prevent unauthorized access and misuse. AWS Chatbot does not store or use interactions
     * in chat channels with Amazon Q for training AWS Chatbot’s AI technologies.
     * 
     * @return Turns on training data collection. This helps improve the AWS Chatbot experience by allowing AWS Chatbot
     *         to store and use your customer information, such as AWS Chatbot configurations, notifications, user
     *         inputs, AWS Chatbot generated responses, and interaction data. This data helps us to continuously improve
     *         and develop Artificial Intelligence (AI) technologies. Your data is not shared with any third parties and
     *         is protected using sophisticated controls to prevent unauthorized access and misuse. AWS Chatbot does not
     *         store or use interactions in chat channels with Amazon Q for training AWS Chatbot’s AI technologies.
     */

    public Boolean getTrainingDataCollectionEnabled() {
        return this.trainingDataCollectionEnabled;
    }

    /**
     * Turns on training data collection. This helps improve the AWS Chatbot experience by allowing AWS Chatbot to store
     * and use your customer information, such as AWS Chatbot configurations, notifications, user inputs, AWS Chatbot
     * generated responses, and interaction data. This data helps us to continuously improve and develop Artificial
     * Intelligence (AI) technologies. Your data is not shared with any third parties and is protected using
     * sophisticated controls to prevent unauthorized access and misuse. AWS Chatbot does not store or use interactions
     * in chat channels with Amazon Q for training AWS Chatbot’s AI technologies.
     * 
     * @param trainingDataCollectionEnabled
     *        Turns on training data collection. This helps improve the AWS Chatbot experience by allowing AWS Chatbot
     *        to store and use your customer information, such as AWS Chatbot configurations, notifications, user
     *        inputs, AWS Chatbot generated responses, and interaction data. This data helps us to continuously improve
     *        and develop Artificial Intelligence (AI) technologies. Your data is not shared with any third parties and
     *        is protected using sophisticated controls to prevent unauthorized access and misuse. AWS Chatbot does not
     *        store or use interactions in chat channels with Amazon Q for training AWS Chatbot’s AI technologies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPreferencesRequest withTrainingDataCollectionEnabled(Boolean trainingDataCollectionEnabled) {
        setTrainingDataCollectionEnabled(trainingDataCollectionEnabled);
        return this;
    }

    /**
     * Turns on training data collection. This helps improve the AWS Chatbot experience by allowing AWS Chatbot to store
     * and use your customer information, such as AWS Chatbot configurations, notifications, user inputs, AWS Chatbot
     * generated responses, and interaction data. This data helps us to continuously improve and develop Artificial
     * Intelligence (AI) technologies. Your data is not shared with any third parties and is protected using
     * sophisticated controls to prevent unauthorized access and misuse. AWS Chatbot does not store or use interactions
     * in chat channels with Amazon Q for training AWS Chatbot’s AI technologies.
     * 
     * @return Turns on training data collection. This helps improve the AWS Chatbot experience by allowing AWS Chatbot
     *         to store and use your customer information, such as AWS Chatbot configurations, notifications, user
     *         inputs, AWS Chatbot generated responses, and interaction data. This data helps us to continuously improve
     *         and develop Artificial Intelligence (AI) technologies. Your data is not shared with any third parties and
     *         is protected using sophisticated controls to prevent unauthorized access and misuse. AWS Chatbot does not
     *         store or use interactions in chat channels with Amazon Q for training AWS Chatbot’s AI technologies.
     */

    public Boolean isTrainingDataCollectionEnabled() {
        return this.trainingDataCollectionEnabled;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserAuthorizationRequired() != null)
            sb.append("UserAuthorizationRequired: ").append(getUserAuthorizationRequired()).append(",");
        if (getTrainingDataCollectionEnabled() != null)
            sb.append("TrainingDataCollectionEnabled: ").append(getTrainingDataCollectionEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountPreferencesRequest == false)
            return false;
        UpdateAccountPreferencesRequest other = (UpdateAccountPreferencesRequest) obj;
        if (other.getUserAuthorizationRequired() == null ^ this.getUserAuthorizationRequired() == null)
            return false;
        if (other.getUserAuthorizationRequired() != null && other.getUserAuthorizationRequired().equals(this.getUserAuthorizationRequired()) == false)
            return false;
        if (other.getTrainingDataCollectionEnabled() == null ^ this.getTrainingDataCollectionEnabled() == null)
            return false;
        if (other.getTrainingDataCollectionEnabled() != null
                && other.getTrainingDataCollectionEnabled().equals(this.getTrainingDataCollectionEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserAuthorizationRequired() == null) ? 0 : getUserAuthorizationRequired().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataCollectionEnabled() == null) ? 0 : getTrainingDataCollectionEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountPreferencesRequest clone() {
        return (UpdateAccountPreferencesRequest) super.clone();
    }

}
