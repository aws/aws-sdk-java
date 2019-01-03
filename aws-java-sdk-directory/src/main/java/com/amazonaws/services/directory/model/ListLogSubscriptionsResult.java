/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListLogSubscriptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLogSubscriptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of active <a>LogSubscription</a> objects for calling the AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LogSubscription> logSubscriptions;
    /**
     * <p>
     * The token for the next set of items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of active <a>LogSubscription</a> objects for calling the AWS account.
     * </p>
     * 
     * @return A list of active <a>LogSubscription</a> objects for calling the AWS account.
     */

    public java.util.List<LogSubscription> getLogSubscriptions() {
        if (logSubscriptions == null) {
            logSubscriptions = new com.amazonaws.internal.SdkInternalList<LogSubscription>();
        }
        return logSubscriptions;
    }

    /**
     * <p>
     * A list of active <a>LogSubscription</a> objects for calling the AWS account.
     * </p>
     * 
     * @param logSubscriptions
     *        A list of active <a>LogSubscription</a> objects for calling the AWS account.
     */

    public void setLogSubscriptions(java.util.Collection<LogSubscription> logSubscriptions) {
        if (logSubscriptions == null) {
            this.logSubscriptions = null;
            return;
        }

        this.logSubscriptions = new com.amazonaws.internal.SdkInternalList<LogSubscription>(logSubscriptions);
    }

    /**
     * <p>
     * A list of active <a>LogSubscription</a> objects for calling the AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogSubscriptions(java.util.Collection)} or {@link #withLogSubscriptions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param logSubscriptions
     *        A list of active <a>LogSubscription</a> objects for calling the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSubscriptionsResult withLogSubscriptions(LogSubscription... logSubscriptions) {
        if (this.logSubscriptions == null) {
            setLogSubscriptions(new com.amazonaws.internal.SdkInternalList<LogSubscription>(logSubscriptions.length));
        }
        for (LogSubscription ele : logSubscriptions) {
            this.logSubscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of active <a>LogSubscription</a> objects for calling the AWS account.
     * </p>
     * 
     * @param logSubscriptions
     *        A list of active <a>LogSubscription</a> objects for calling the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSubscriptionsResult withLogSubscriptions(java.util.Collection<LogSubscription> logSubscriptions) {
        setLogSubscriptions(logSubscriptions);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return.
     * </p>
     * 
     * @return The token for the next set of items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSubscriptionsResult withNextToken(String nextToken) {
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
        if (getLogSubscriptions() != null)
            sb.append("LogSubscriptions: ").append(getLogSubscriptions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLogSubscriptionsResult == false)
            return false;
        ListLogSubscriptionsResult other = (ListLogSubscriptionsResult) obj;
        if (other.getLogSubscriptions() == null ^ this.getLogSubscriptions() == null)
            return false;
        if (other.getLogSubscriptions() != null && other.getLogSubscriptions().equals(this.getLogSubscriptions()) == false)
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

        hashCode = prime * hashCode + ((getLogSubscriptions() == null) ? 0 : getLogSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLogSubscriptionsResult clone() {
        try {
            return (ListLogSubscriptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
