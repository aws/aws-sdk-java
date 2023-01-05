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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the integration of DevOps Guru as consumer with another AWS service, such as AWS CodeGuru Profiler
 * via EventBridge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/EventSourcesConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSourcesConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about whether DevOps Guru is configured to consume recommendations which are generated from AWS
     * CodeGuru Profiler.
     * </p>
     */
    private AmazonCodeGuruProfilerIntegration amazonCodeGuruProfiler;

    /**
     * <p>
     * Information about whether DevOps Guru is configured to consume recommendations which are generated from AWS
     * CodeGuru Profiler.
     * </p>
     * 
     * @param amazonCodeGuruProfiler
     *        Information about whether DevOps Guru is configured to consume recommendations which are generated from
     *        AWS CodeGuru Profiler.
     */

    public void setAmazonCodeGuruProfiler(AmazonCodeGuruProfilerIntegration amazonCodeGuruProfiler) {
        this.amazonCodeGuruProfiler = amazonCodeGuruProfiler;
    }

    /**
     * <p>
     * Information about whether DevOps Guru is configured to consume recommendations which are generated from AWS
     * CodeGuru Profiler.
     * </p>
     * 
     * @return Information about whether DevOps Guru is configured to consume recommendations which are generated from
     *         AWS CodeGuru Profiler.
     */

    public AmazonCodeGuruProfilerIntegration getAmazonCodeGuruProfiler() {
        return this.amazonCodeGuruProfiler;
    }

    /**
     * <p>
     * Information about whether DevOps Guru is configured to consume recommendations which are generated from AWS
     * CodeGuru Profiler.
     * </p>
     * 
     * @param amazonCodeGuruProfiler
     *        Information about whether DevOps Guru is configured to consume recommendations which are generated from
     *        AWS CodeGuru Profiler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourcesConfig withAmazonCodeGuruProfiler(AmazonCodeGuruProfilerIntegration amazonCodeGuruProfiler) {
        setAmazonCodeGuruProfiler(amazonCodeGuruProfiler);
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
        if (getAmazonCodeGuruProfiler() != null)
            sb.append("AmazonCodeGuruProfiler: ").append(getAmazonCodeGuruProfiler());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventSourcesConfig == false)
            return false;
        EventSourcesConfig other = (EventSourcesConfig) obj;
        if (other.getAmazonCodeGuruProfiler() == null ^ this.getAmazonCodeGuruProfiler() == null)
            return false;
        if (other.getAmazonCodeGuruProfiler() != null && other.getAmazonCodeGuruProfiler().equals(this.getAmazonCodeGuruProfiler()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonCodeGuruProfiler() == null) ? 0 : getAmazonCodeGuruProfiler().hashCode());
        return hashCode;
    }

    @Override
    public EventSourcesConfig clone() {
        try {
            return (EventSourcesConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.EventSourcesConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
