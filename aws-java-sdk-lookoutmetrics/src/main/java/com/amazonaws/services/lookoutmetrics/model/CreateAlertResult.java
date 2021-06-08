/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAlert" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAlertResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the alert.
     * </p>
     */
    private String alertArn;

    /**
     * <p>
     * The ARN of the alert.
     * </p>
     * 
     * @param alertArn
     *        The ARN of the alert.
     */

    public void setAlertArn(String alertArn) {
        this.alertArn = alertArn;
    }

    /**
     * <p>
     * The ARN of the alert.
     * </p>
     * 
     * @return The ARN of the alert.
     */

    public String getAlertArn() {
        return this.alertArn;
    }

    /**
     * <p>
     * The ARN of the alert.
     * </p>
     * 
     * @param alertArn
     *        The ARN of the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlertResult withAlertArn(String alertArn) {
        setAlertArn(alertArn);
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
        if (getAlertArn() != null)
            sb.append("AlertArn: ").append(getAlertArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAlertResult == false)
            return false;
        CreateAlertResult other = (CreateAlertResult) obj;
        if (other.getAlertArn() == null ^ this.getAlertArn() == null)
            return false;
        if (other.getAlertArn() != null && other.getAlertArn().equals(this.getAlertArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlertArn() == null) ? 0 : getAlertArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateAlertResult clone() {
        try {
            return (CreateAlertResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
