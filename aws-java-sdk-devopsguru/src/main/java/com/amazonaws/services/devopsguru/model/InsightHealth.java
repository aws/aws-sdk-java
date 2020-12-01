/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/InsightHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightHealth implements Serializable, Cloneable, StructuredPojo {

    private Long meanTimeToRecoverInMilliseconds;

    private Integer openProactiveInsights;

    private Integer openReactiveInsights;

    /**
     * @param meanTimeToRecoverInMilliseconds
     */

    public void setMeanTimeToRecoverInMilliseconds(Long meanTimeToRecoverInMilliseconds) {
        this.meanTimeToRecoverInMilliseconds = meanTimeToRecoverInMilliseconds;
    }

    /**
     * @return
     */

    public Long getMeanTimeToRecoverInMilliseconds() {
        return this.meanTimeToRecoverInMilliseconds;
    }

    /**
     * @param meanTimeToRecoverInMilliseconds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightHealth withMeanTimeToRecoverInMilliseconds(Long meanTimeToRecoverInMilliseconds) {
        setMeanTimeToRecoverInMilliseconds(meanTimeToRecoverInMilliseconds);
        return this;
    }

    /**
     * @param openProactiveInsights
     */

    public void setOpenProactiveInsights(Integer openProactiveInsights) {
        this.openProactiveInsights = openProactiveInsights;
    }

    /**
     * @return
     */

    public Integer getOpenProactiveInsights() {
        return this.openProactiveInsights;
    }

    /**
     * @param openProactiveInsights
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightHealth withOpenProactiveInsights(Integer openProactiveInsights) {
        setOpenProactiveInsights(openProactiveInsights);
        return this;
    }

    /**
     * @param openReactiveInsights
     */

    public void setOpenReactiveInsights(Integer openReactiveInsights) {
        this.openReactiveInsights = openReactiveInsights;
    }

    /**
     * @return
     */

    public Integer getOpenReactiveInsights() {
        return this.openReactiveInsights;
    }

    /**
     * @param openReactiveInsights
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightHealth withOpenReactiveInsights(Integer openReactiveInsights) {
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
        if (getMeanTimeToRecoverInMilliseconds() != null)
            sb.append("MeanTimeToRecoverInMilliseconds: ").append(getMeanTimeToRecoverInMilliseconds()).append(",");
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

        if (obj instanceof InsightHealth == false)
            return false;
        InsightHealth other = (InsightHealth) obj;
        if (other.getMeanTimeToRecoverInMilliseconds() == null ^ this.getMeanTimeToRecoverInMilliseconds() == null)
            return false;
        if (other.getMeanTimeToRecoverInMilliseconds() != null
                && other.getMeanTimeToRecoverInMilliseconds().equals(this.getMeanTimeToRecoverInMilliseconds()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getMeanTimeToRecoverInMilliseconds() == null) ? 0 : getMeanTimeToRecoverInMilliseconds().hashCode());
        hashCode = prime * hashCode + ((getOpenProactiveInsights() == null) ? 0 : getOpenProactiveInsights().hashCode());
        hashCode = prime * hashCode + ((getOpenReactiveInsights() == null) ? 0 : getOpenReactiveInsights().hashCode());
        return hashCode;
    }

    @Override
    public InsightHealth clone() {
        try {
            return (InsightHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.InsightHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
