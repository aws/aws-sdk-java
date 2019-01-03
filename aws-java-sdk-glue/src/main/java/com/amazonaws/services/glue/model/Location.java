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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location of resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A JDBC location.
     * </p>
     */
    private java.util.List<CodeGenNodeArg> jdbc;
    /**
     * <p>
     * An Amazon S3 location.
     * </p>
     */
    private java.util.List<CodeGenNodeArg> s3;
    /**
     * <p>
     * A DynamoDB Table location.
     * </p>
     */
    private java.util.List<CodeGenNodeArg> dynamoDB;

    /**
     * <p>
     * A JDBC location.
     * </p>
     * 
     * @return A JDBC location.
     */

    public java.util.List<CodeGenNodeArg> getJdbc() {
        return jdbc;
    }

    /**
     * <p>
     * A JDBC location.
     * </p>
     * 
     * @param jdbc
     *        A JDBC location.
     */

    public void setJdbc(java.util.Collection<CodeGenNodeArg> jdbc) {
        if (jdbc == null) {
            this.jdbc = null;
            return;
        }

        this.jdbc = new java.util.ArrayList<CodeGenNodeArg>(jdbc);
    }

    /**
     * <p>
     * A JDBC location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJdbc(java.util.Collection)} or {@link #withJdbc(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jdbc
     *        A JDBC location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withJdbc(CodeGenNodeArg... jdbc) {
        if (this.jdbc == null) {
            setJdbc(new java.util.ArrayList<CodeGenNodeArg>(jdbc.length));
        }
        for (CodeGenNodeArg ele : jdbc) {
            this.jdbc.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JDBC location.
     * </p>
     * 
     * @param jdbc
     *        A JDBC location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withJdbc(java.util.Collection<CodeGenNodeArg> jdbc) {
        setJdbc(jdbc);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 location.
     * </p>
     * 
     * @return An Amazon S3 location.
     */

    public java.util.List<CodeGenNodeArg> getS3() {
        return s3;
    }

    /**
     * <p>
     * An Amazon S3 location.
     * </p>
     * 
     * @param s3
     *        An Amazon S3 location.
     */

    public void setS3(java.util.Collection<CodeGenNodeArg> s3) {
        if (s3 == null) {
            this.s3 = null;
            return;
        }

        this.s3 = new java.util.ArrayList<CodeGenNodeArg>(s3);
    }

    /**
     * <p>
     * An Amazon S3 location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3(java.util.Collection)} or {@link #withS3(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param s3
     *        An Amazon S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withS3(CodeGenNodeArg... s3) {
        if (this.s3 == null) {
            setS3(new java.util.ArrayList<CodeGenNodeArg>(s3.length));
        }
        for (CodeGenNodeArg ele : s3) {
            this.s3.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An Amazon S3 location.
     * </p>
     * 
     * @param s3
     *        An Amazon S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withS3(java.util.Collection<CodeGenNodeArg> s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * A DynamoDB Table location.
     * </p>
     * 
     * @return A DynamoDB Table location.
     */

    public java.util.List<CodeGenNodeArg> getDynamoDB() {
        return dynamoDB;
    }

    /**
     * <p>
     * A DynamoDB Table location.
     * </p>
     * 
     * @param dynamoDB
     *        A DynamoDB Table location.
     */

    public void setDynamoDB(java.util.Collection<CodeGenNodeArg> dynamoDB) {
        if (dynamoDB == null) {
            this.dynamoDB = null;
            return;
        }

        this.dynamoDB = new java.util.ArrayList<CodeGenNodeArg>(dynamoDB);
    }

    /**
     * <p>
     * A DynamoDB Table location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDynamoDB(java.util.Collection)} or {@link #withDynamoDB(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dynamoDB
     *        A DynamoDB Table location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withDynamoDB(CodeGenNodeArg... dynamoDB) {
        if (this.dynamoDB == null) {
            setDynamoDB(new java.util.ArrayList<CodeGenNodeArg>(dynamoDB.length));
        }
        for (CodeGenNodeArg ele : dynamoDB) {
            this.dynamoDB.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A DynamoDB Table location.
     * </p>
     * 
     * @param dynamoDB
     *        A DynamoDB Table location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withDynamoDB(java.util.Collection<CodeGenNodeArg> dynamoDB) {
        setDynamoDB(dynamoDB);
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
        if (getJdbc() != null)
            sb.append("Jdbc: ").append(getJdbc()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getDynamoDB() != null)
            sb.append("DynamoDB: ").append(getDynamoDB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Location == false)
            return false;
        Location other = (Location) obj;
        if (other.getJdbc() == null ^ this.getJdbc() == null)
            return false;
        if (other.getJdbc() != null && other.getJdbc().equals(this.getJdbc()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getDynamoDB() == null ^ this.getDynamoDB() == null)
            return false;
        if (other.getDynamoDB() != null && other.getDynamoDB().equals(this.getDynamoDB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJdbc() == null) ? 0 : getJdbc().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getDynamoDB() == null) ? 0 : getDynamoDB().hashCode());
        return hashCode;
    }

    @Override
    public Location clone() {
        try {
            return (Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
