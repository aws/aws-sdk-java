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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The alias of an Object Lambda Access Point. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-use.html#ol-access-points-alias">How to use a
 * bucket-style alias for your S3 bucket Object Lambda Access Point</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ObjectLambdaAccessPointAlias"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectLambdaAccessPointAlias implements Serializable, Cloneable {

    /**
     * <p>
     * The alias value of the Object Lambda Access Point.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The status of the Object Lambda Access Point alias. If the status is <code>PROVISIONING</code>, the Object Lambda
     * Access Point is provisioning the alias and the alias is not ready for use yet. If the status is
     * <code>READY</code>, the Object Lambda Access Point alias is successfully provisioned and ready for use.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The alias value of the Object Lambda Access Point.
     * </p>
     * 
     * @param value
     *        The alias value of the Object Lambda Access Point.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The alias value of the Object Lambda Access Point.
     * </p>
     * 
     * @return The alias value of the Object Lambda Access Point.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The alias value of the Object Lambda Access Point.
     * </p>
     * 
     * @param value
     *        The alias value of the Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLambdaAccessPointAlias withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The status of the Object Lambda Access Point alias. If the status is <code>PROVISIONING</code>, the Object Lambda
     * Access Point is provisioning the alias and the alias is not ready for use yet. If the status is
     * <code>READY</code>, the Object Lambda Access Point alias is successfully provisioned and ready for use.
     * </p>
     * 
     * @param status
     *        The status of the Object Lambda Access Point alias. If the status is <code>PROVISIONING</code>, the Object
     *        Lambda Access Point is provisioning the alias and the alias is not ready for use yet. If the status is
     *        <code>READY</code>, the Object Lambda Access Point alias is successfully provisioned and ready for use.
     * @see ObjectLambdaAccessPointAliasStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Object Lambda Access Point alias. If the status is <code>PROVISIONING</code>, the Object Lambda
     * Access Point is provisioning the alias and the alias is not ready for use yet. If the status is
     * <code>READY</code>, the Object Lambda Access Point alias is successfully provisioned and ready for use.
     * </p>
     * 
     * @return The status of the Object Lambda Access Point alias. If the status is <code>PROVISIONING</code>, the
     *         Object Lambda Access Point is provisioning the alias and the alias is not ready for use yet. If the
     *         status is <code>READY</code>, the Object Lambda Access Point alias is successfully provisioned and ready
     *         for use.
     * @see ObjectLambdaAccessPointAliasStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Object Lambda Access Point alias. If the status is <code>PROVISIONING</code>, the Object Lambda
     * Access Point is provisioning the alias and the alias is not ready for use yet. If the status is
     * <code>READY</code>, the Object Lambda Access Point alias is successfully provisioned and ready for use.
     * </p>
     * 
     * @param status
     *        The status of the Object Lambda Access Point alias. If the status is <code>PROVISIONING</code>, the Object
     *        Lambda Access Point is provisioning the alias and the alias is not ready for use yet. If the status is
     *        <code>READY</code>, the Object Lambda Access Point alias is successfully provisioned and ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectLambdaAccessPointAliasStatus
     */

    public ObjectLambdaAccessPointAlias withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Object Lambda Access Point alias. If the status is <code>PROVISIONING</code>, the Object Lambda
     * Access Point is provisioning the alias and the alias is not ready for use yet. If the status is
     * <code>READY</code>, the Object Lambda Access Point alias is successfully provisioned and ready for use.
     * </p>
     * 
     * @param status
     *        The status of the Object Lambda Access Point alias. If the status is <code>PROVISIONING</code>, the Object
     *        Lambda Access Point is provisioning the alias and the alias is not ready for use yet. If the status is
     *        <code>READY</code>, the Object Lambda Access Point alias is successfully provisioned and ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectLambdaAccessPointAliasStatus
     */

    public ObjectLambdaAccessPointAlias withStatus(ObjectLambdaAccessPointAliasStatus status) {
        this.status = status.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectLambdaAccessPointAlias == false)
            return false;
        ObjectLambdaAccessPointAlias other = (ObjectLambdaAccessPointAlias) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ObjectLambdaAccessPointAlias clone() {
        try {
            return (ObjectLambdaAccessPointAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
