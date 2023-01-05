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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the summary of application components.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ApplicationComponentSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationComponentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the name of application types.
     * </p>
     */
    private String appType;
    /**
     * <p>
     * Contains the count of application type.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * Contains the name of application types.
     * </p>
     * 
     * @param appType
     *        Contains the name of application types.
     * @see AppType
     */

    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * <p>
     * Contains the name of application types.
     * </p>
     * 
     * @return Contains the name of application types.
     * @see AppType
     */

    public String getAppType() {
        return this.appType;
    }

    /**
     * <p>
     * Contains the name of application types.
     * </p>
     * 
     * @param appType
     *        Contains the name of application types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public ApplicationComponentSummary withAppType(String appType) {
        setAppType(appType);
        return this;
    }

    /**
     * <p>
     * Contains the name of application types.
     * </p>
     * 
     * @param appType
     *        Contains the name of application types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public ApplicationComponentSummary withAppType(AppType appType) {
        this.appType = appType.toString();
        return this;
    }

    /**
     * <p>
     * Contains the count of application type.
     * </p>
     * 
     * @param count
     *        Contains the count of application type.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * Contains the count of application type.
     * </p>
     * 
     * @return Contains the count of application type.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * Contains the count of application type.
     * </p>
     * 
     * @param count
     *        Contains the count of application type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentSummary withCount(Integer count) {
        setCount(count);
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
        if (getAppType() != null)
            sb.append("AppType: ").append(getAppType()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationComponentSummary == false)
            return false;
        ApplicationComponentSummary other = (ApplicationComponentSummary) obj;
        if (other.getAppType() == null ^ this.getAppType() == null)
            return false;
        if (other.getAppType() != null && other.getAppType().equals(this.getAppType()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppType() == null) ? 0 : getAppType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationComponentSummary clone() {
        try {
            return (ApplicationComponentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ApplicationComponentSummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
