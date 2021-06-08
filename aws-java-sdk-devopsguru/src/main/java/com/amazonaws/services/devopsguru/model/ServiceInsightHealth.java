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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the number of open proactive and reactive insights in an analyzed AWS service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ServiceInsightHealth" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceInsightHealth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of open proactive insights in the AWS service
     * </p>
     */
    private Integer openProactiveInsights;
    /**
     * <p>
     * The number of open reactive insights in the AWS service
     * </p>
     */
    private Integer openReactiveInsights;

    /**
     * <p>
     * The number of open proactive insights in the AWS service
     * </p>
     * 
     * @param openProactiveInsights
     *        The number of open proactive insights in the AWS service
     */

    public void setOpenProactiveInsights(Integer openProactiveInsights) {
        this.openProactiveInsights = openProactiveInsights;
    }

    /**
     * <p>
     * The number of open proactive insights in the AWS service
     * </p>
     * 
     * @return The number of open proactive insights in the AWS service
     */

    public Integer getOpenProactiveInsights() {
        return this.openProactiveInsights;
    }

    /**
     * <p>
     * The number of open proactive insights in the AWS service
     * </p>
     * 
     * @param openProactiveInsights
     *        The number of open proactive insights in the AWS service
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInsightHealth withOpenProactiveInsights(Integer openProactiveInsights) {
        setOpenProactiveInsights(openProactiveInsights);
        return this;
    }

    /**
     * <p>
     * The number of open reactive insights in the AWS service
     * </p>
     * 
     * @param openReactiveInsights
     *        The number of open reactive insights in the AWS service
     */

    public void setOpenReactiveInsights(Integer openReactiveInsights) {
        this.openReactiveInsights = openReactiveInsights;
    }

    /**
     * <p>
     * The number of open reactive insights in the AWS service
     * </p>
     * 
     * @return The number of open reactive insights in the AWS service
     */

    public Integer getOpenReactiveInsights() {
        return this.openReactiveInsights;
    }

    /**
     * <p>
     * The number of open reactive insights in the AWS service
     * </p>
     * 
     * @param openReactiveInsights
     *        The number of open reactive insights in the AWS service
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInsightHealth withOpenReactiveInsights(Integer openReactiveInsights) {
        setOpenReactiveInsights(openReactiveInsights);
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
        if (getOpenProactiveInsights() != null)
            sb.append("OpenProactiveInsights: ").append(getOpenProactiveInsights()).append(",");
        if (getOpenReactiveInsights() != null)
            sb.append("OpenReactiveInsights: ").append(getOpenReactiveInsights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceInsightHealth == false)
            return false;
        ServiceInsightHealth other = (ServiceInsightHealth) obj;
        if (other.getOpenProactiveInsights() == null ^ this.getOpenProactiveInsights() == null)
            return false;
        if (other.getOpenProactiveInsights() != null && other.getOpenProactiveInsights().equals(this.getOpenProactiveInsights()) == false)
            return false;
        if (other.getOpenReactiveInsights() == null ^ this.getOpenReactiveInsights() == null)
            return false;
        if (other.getOpenReactiveInsights() != null && other.getOpenReactiveInsights().equals(this.getOpenReactiveInsights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpenProactiveInsights() == null) ? 0 : getOpenProactiveInsights().hashCode());
        hashCode = prime * hashCode + ((getOpenReactiveInsights() == null) ? 0 : getOpenReactiveInsights().hashCode());
        return hashCode;
    }

    @Override
    public ServiceInsightHealth clone() {
        try {
            return (ServiceInsightHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ServiceInsightHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
