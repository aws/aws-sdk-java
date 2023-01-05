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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor resource.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to monitor.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the monitor resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the monitor resource.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor resource.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor resource.
     * </p>
     * 
     * @return The name of the monitor resource.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor resource.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to monitor.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the predictor to monitor.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to monitor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the predictor to monitor.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to monitor.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the predictor to monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the monitor resource.
     * </p>
     * 
     * @return A list of <a
     *         href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply
     *         to the monitor resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the monitor resource.
     * </p>
     * 
     * @param tags
     *        A list of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply to
     *        the monitor resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the monitor resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply to
     *        the monitor resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the monitor resource.
     * </p>
     * 
     * @param tags
     *        A list of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply to
     *        the monitor resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMonitorRequest == false)
            return false;
        CreateMonitorRequest other = (CreateMonitorRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMonitorRequest clone() {
        return (CreateMonitorRequest) super.clone();
    }

}
