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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceBots"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppInstanceBotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the AppInstance.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The information for each requested <code>AppInstanceBot</code>.
     * </p>
     */
    private java.util.List<AppInstanceBotSummary> appInstanceBots;
    /**
     * <p>
     * The token passed by previous API calls until all requested bots are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the AppInstance.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the AppInstance.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the AppInstance.
     * </p>
     * 
     * @return The ARN of the AppInstance.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the AppInstance.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the AppInstance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceBotsResult withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceBot</code>.
     * </p>
     * 
     * @return The information for each requested <code>AppInstanceBot</code>.
     */

    public java.util.List<AppInstanceBotSummary> getAppInstanceBots() {
        return appInstanceBots;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param appInstanceBots
     *        The information for each requested <code>AppInstanceBot</code>.
     */

    public void setAppInstanceBots(java.util.Collection<AppInstanceBotSummary> appInstanceBots) {
        if (appInstanceBots == null) {
            this.appInstanceBots = null;
            return;
        }

        this.appInstanceBots = new java.util.ArrayList<AppInstanceBotSummary>(appInstanceBots);
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppInstanceBots(java.util.Collection)} or {@link #withAppInstanceBots(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param appInstanceBots
     *        The information for each requested <code>AppInstanceBot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceBotsResult withAppInstanceBots(AppInstanceBotSummary... appInstanceBots) {
        if (this.appInstanceBots == null) {
            setAppInstanceBots(new java.util.ArrayList<AppInstanceBotSummary>(appInstanceBots.length));
        }
        for (AppInstanceBotSummary ele : appInstanceBots) {
            this.appInstanceBots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param appInstanceBots
     *        The information for each requested <code>AppInstanceBot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceBotsResult withAppInstanceBots(java.util.Collection<AppInstanceBotSummary> appInstanceBots) {
        setAppInstanceBots(appInstanceBots);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested bots are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested bots are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested bots are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested bots are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested bots are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested bots are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceBotsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getAppInstanceBots() != null)
            sb.append("AppInstanceBots: ").append(getAppInstanceBots()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppInstanceBotsResult == false)
            return false;
        ListAppInstanceBotsResult other = (ListAppInstanceBotsResult) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getAppInstanceBots() == null ^ this.getAppInstanceBots() == null)
            return false;
        if (other.getAppInstanceBots() != null && other.getAppInstanceBots().equals(this.getAppInstanceBots()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAppInstanceBots() == null) ? 0 : getAppInstanceBots().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppInstanceBotsResult clone() {
        try {
            return (ListAppInstanceBotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
