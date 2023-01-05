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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An auto detection source config.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AutoDetectionS3SourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoDetectionS3SourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The config's templated path list.
     * </p>
     */
    private java.util.List<String> templatedPathList;
    /**
     * <p>
     * The config's historical data path list.
     * </p>
     */
    private java.util.List<String> historicalDataPathList;

    /**
     * <p>
     * The config's templated path list.
     * </p>
     * 
     * @return The config's templated path list.
     */

    public java.util.List<String> getTemplatedPathList() {
        return templatedPathList;
    }

    /**
     * <p>
     * The config's templated path list.
     * </p>
     * 
     * @param templatedPathList
     *        The config's templated path list.
     */

    public void setTemplatedPathList(java.util.Collection<String> templatedPathList) {
        if (templatedPathList == null) {
            this.templatedPathList = null;
            return;
        }

        this.templatedPathList = new java.util.ArrayList<String>(templatedPathList);
    }

    /**
     * <p>
     * The config's templated path list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplatedPathList(java.util.Collection)} or {@link #withTemplatedPathList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param templatedPathList
     *        The config's templated path list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoDetectionS3SourceConfig withTemplatedPathList(String... templatedPathList) {
        if (this.templatedPathList == null) {
            setTemplatedPathList(new java.util.ArrayList<String>(templatedPathList.length));
        }
        for (String ele : templatedPathList) {
            this.templatedPathList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The config's templated path list.
     * </p>
     * 
     * @param templatedPathList
     *        The config's templated path list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoDetectionS3SourceConfig withTemplatedPathList(java.util.Collection<String> templatedPathList) {
        setTemplatedPathList(templatedPathList);
        return this;
    }

    /**
     * <p>
     * The config's historical data path list.
     * </p>
     * 
     * @return The config's historical data path list.
     */

    public java.util.List<String> getHistoricalDataPathList() {
        return historicalDataPathList;
    }

    /**
     * <p>
     * The config's historical data path list.
     * </p>
     * 
     * @param historicalDataPathList
     *        The config's historical data path list.
     */

    public void setHistoricalDataPathList(java.util.Collection<String> historicalDataPathList) {
        if (historicalDataPathList == null) {
            this.historicalDataPathList = null;
            return;
        }

        this.historicalDataPathList = new java.util.ArrayList<String>(historicalDataPathList);
    }

    /**
     * <p>
     * The config's historical data path list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHistoricalDataPathList(java.util.Collection)} or
     * {@link #withHistoricalDataPathList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param historicalDataPathList
     *        The config's historical data path list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoDetectionS3SourceConfig withHistoricalDataPathList(String... historicalDataPathList) {
        if (this.historicalDataPathList == null) {
            setHistoricalDataPathList(new java.util.ArrayList<String>(historicalDataPathList.length));
        }
        for (String ele : historicalDataPathList) {
            this.historicalDataPathList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The config's historical data path list.
     * </p>
     * 
     * @param historicalDataPathList
     *        The config's historical data path list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoDetectionS3SourceConfig withHistoricalDataPathList(java.util.Collection<String> historicalDataPathList) {
        setHistoricalDataPathList(historicalDataPathList);
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
        if (getTemplatedPathList() != null)
            sb.append("TemplatedPathList: ").append(getTemplatedPathList()).append(",");
        if (getHistoricalDataPathList() != null)
            sb.append("HistoricalDataPathList: ").append(getHistoricalDataPathList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoDetectionS3SourceConfig == false)
            return false;
        AutoDetectionS3SourceConfig other = (AutoDetectionS3SourceConfig) obj;
        if (other.getTemplatedPathList() == null ^ this.getTemplatedPathList() == null)
            return false;
        if (other.getTemplatedPathList() != null && other.getTemplatedPathList().equals(this.getTemplatedPathList()) == false)
            return false;
        if (other.getHistoricalDataPathList() == null ^ this.getHistoricalDataPathList() == null)
            return false;
        if (other.getHistoricalDataPathList() != null && other.getHistoricalDataPathList().equals(this.getHistoricalDataPathList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplatedPathList() == null) ? 0 : getTemplatedPathList().hashCode());
        hashCode = prime * hashCode + ((getHistoricalDataPathList() == null) ? 0 : getHistoricalDataPathList().hashCode());
        return hashCode;
    }

    @Override
    public AutoDetectionS3SourceConfig clone() {
        try {
            return (AutoDetectionS3SourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AutoDetectionS3SourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
