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
 * An access point with an attached Lambda function used to access transformed data from an Amazon S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ObjectLambdaAccessPoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectLambdaAccessPoint implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the ARN for the Object Lambda Access Point.
     * </p>
     */
    private String objectLambdaAccessPointArn;
    /**
     * <p>
     * The alias of the Object Lambda Access Point.
     * </p>
     */
    private ObjectLambdaAccessPointAlias alias;

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Object Lambda Access Point.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     * 
     * @return The name of the Object Lambda Access Point.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLambdaAccessPoint withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN for the Object Lambda Access Point.
     * </p>
     * 
     * @param objectLambdaAccessPointArn
     *        Specifies the ARN for the Object Lambda Access Point.
     */

    public void setObjectLambdaAccessPointArn(String objectLambdaAccessPointArn) {
        this.objectLambdaAccessPointArn = objectLambdaAccessPointArn;
    }

    /**
     * <p>
     * Specifies the ARN for the Object Lambda Access Point.
     * </p>
     * 
     * @return Specifies the ARN for the Object Lambda Access Point.
     */

    public String getObjectLambdaAccessPointArn() {
        return this.objectLambdaAccessPointArn;
    }

    /**
     * <p>
     * Specifies the ARN for the Object Lambda Access Point.
     * </p>
     * 
     * @param objectLambdaAccessPointArn
     *        Specifies the ARN for the Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLambdaAccessPoint withObjectLambdaAccessPointArn(String objectLambdaAccessPointArn) {
        setObjectLambdaAccessPointArn(objectLambdaAccessPointArn);
        return this;
    }

    /**
     * <p>
     * The alias of the Object Lambda Access Point.
     * </p>
     * 
     * @param alias
     *        The alias of the Object Lambda Access Point.
     */

    public void setAlias(ObjectLambdaAccessPointAlias alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias of the Object Lambda Access Point.
     * </p>
     * 
     * @return The alias of the Object Lambda Access Point.
     */

    public ObjectLambdaAccessPointAlias getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias of the Object Lambda Access Point.
     * </p>
     * 
     * @param alias
     *        The alias of the Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLambdaAccessPoint withAlias(ObjectLambdaAccessPointAlias alias) {
        setAlias(alias);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getObjectLambdaAccessPointArn() != null)
            sb.append("ObjectLambdaAccessPointArn: ").append(getObjectLambdaAccessPointArn()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectLambdaAccessPoint == false)
            return false;
        ObjectLambdaAccessPoint other = (ObjectLambdaAccessPoint) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getObjectLambdaAccessPointArn() == null ^ this.getObjectLambdaAccessPointArn() == null)
            return false;
        if (other.getObjectLambdaAccessPointArn() != null && other.getObjectLambdaAccessPointArn().equals(this.getObjectLambdaAccessPointArn()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getObjectLambdaAccessPointArn() == null) ? 0 : getObjectLambdaAccessPointArn().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return hashCode;
    }

    @Override
    public ObjectLambdaAccessPoint clone() {
        try {
            return (ObjectLambdaAccessPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
