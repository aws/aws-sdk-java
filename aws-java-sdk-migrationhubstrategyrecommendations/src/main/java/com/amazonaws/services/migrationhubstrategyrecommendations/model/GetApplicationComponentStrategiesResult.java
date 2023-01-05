/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentStrategies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationComponentStrategiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of application component strategy recommendations.
     * </p>
     */
    private java.util.List<ApplicationComponentStrategy> applicationComponentStrategies;

    /**
     * <p>
     * A list of application component strategy recommendations.
     * </p>
     * 
     * @return A list of application component strategy recommendations.
     */

    public java.util.List<ApplicationComponentStrategy> getApplicationComponentStrategies() {
        return applicationComponentStrategies;
    }

    /**
     * <p>
     * A list of application component strategy recommendations.
     * </p>
     * 
     * @param applicationComponentStrategies
     *        A list of application component strategy recommendations.
     */

    public void setApplicationComponentStrategies(java.util.Collection<ApplicationComponentStrategy> applicationComponentStrategies) {
        if (applicationComponentStrategies == null) {
            this.applicationComponentStrategies = null;
            return;
        }

        this.applicationComponentStrategies = new java.util.ArrayList<ApplicationComponentStrategy>(applicationComponentStrategies);
    }

    /**
     * <p>
     * A list of application component strategy recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationComponentStrategies(java.util.Collection)} or
     * {@link #withApplicationComponentStrategies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationComponentStrategies
     *        A list of application component strategy recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationComponentStrategiesResult withApplicationComponentStrategies(ApplicationComponentStrategy... applicationComponentStrategies) {
        if (this.applicationComponentStrategies == null) {
            setApplicationComponentStrategies(new java.util.ArrayList<ApplicationComponentStrategy>(applicationComponentStrategies.length));
        }
        for (ApplicationComponentStrategy ele : applicationComponentStrategies) {
            this.applicationComponentStrategies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of application component strategy recommendations.
     * </p>
     * 
     * @param applicationComponentStrategies
     *        A list of application component strategy recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationComponentStrategiesResult withApplicationComponentStrategies(
            java.util.Collection<ApplicationComponentStrategy> applicationComponentStrategies) {
        setApplicationComponentStrategies(applicationComponentStrategies);
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
        if (getApplicationComponentStrategies() != null)
            sb.append("ApplicationComponentStrategies: ").append(getApplicationComponentStrategies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationComponentStrategiesResult == false)
            return false;
        GetApplicationComponentStrategiesResult other = (GetApplicationComponentStrategiesResult) obj;
        if (other.getApplicationComponentStrategies() == null ^ this.getApplicationComponentStrategies() == null)
            return false;
        if (other.getApplicationComponentStrategies() != null
                && other.getApplicationComponentStrategies().equals(this.getApplicationComponentStrategies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationComponentStrategies() == null) ? 0 : getApplicationComponentStrategies().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationComponentStrategiesResult clone() {
        try {
            return (GetApplicationComponentStrategiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
