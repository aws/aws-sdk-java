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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter that returns a more specific list of recommendation export jobs.
 * </p>
 * <p>
 * This filter is used with the <code>DescribeRecommendationExportJobs</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/JobFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g.,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specified the <code>name</code>
     * parameter as <code>ResourceType</code>. There is no filter for EBS volumes because volume recommendations cannot
     * be exported at this time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code> if you
     * specified the <code>name</code> parameter as <code>JobStatus</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g.,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g.,
     *        <code>Ec2Instance</code>).
     *        </p>
     *        <p>
     *        Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).
     * @see JobFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g.,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).
     * </p>
     * 
     * @return The name of the filter.</p>
     *         <p>
     *         Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g.,
     *         <code>Ec2Instance</code>).
     *         </p>
     *         <p>
     *         Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).
     * @see JobFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g.,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g.,
     *        <code>Ec2Instance</code>).
     *        </p>
     *        <p>
     *        Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobFilterName
     */

    public JobFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g.,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g.,
     *        <code>Ec2Instance</code>).
     *        </p>
     *        <p>
     *        Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobFilterName
     */

    public JobFilter withName(JobFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specified the <code>name</code>
     * parameter as <code>ResourceType</code>. There is no filter for EBS volumes because volume recommendations cannot
     * be exported at this time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code> if you
     * specified the <code>name</code> parameter as <code>JobStatus</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The value of the filter.</p>
     *         <p>
     *         The valid values for this parameter are as follows, depending on what you specify for the
     *         <code>name</code> parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specified the <code>name</code>
     *         parameter as <code>ResourceType</code>. There is no filter for EBS volumes because volume recommendations
     *         cannot be exported at this time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code> if
     *         you specified the <code>name</code> parameter as <code>JobStatus</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specified the <code>name</code>
     * parameter as <code>ResourceType</code>. There is no filter for EBS volumes because volume recommendations cannot
     * be exported at this time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code> if you
     * specified the <code>name</code> parameter as <code>JobStatus</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        The valid values for this parameter are as follows, depending on what you specify for the
     *        <code>name</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specified the <code>name</code>
     *        parameter as <code>ResourceType</code>. There is no filter for EBS volumes because volume recommendations
     *        cannot be exported at this time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code> if you
     *        specified the <code>name</code> parameter as <code>JobStatus</code>.
     *        </p>
     *        </li>
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specified the <code>name</code>
     * parameter as <code>ResourceType</code>. There is no filter for EBS volumes because volume recommendations cannot
     * be exported at this time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code> if you
     * specified the <code>name</code> parameter as <code>JobStatus</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        The valid values for this parameter are as follows, depending on what you specify for the
     *        <code>name</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specified the <code>name</code>
     *        parameter as <code>ResourceType</code>. There is no filter for EBS volumes because volume recommendations
     *        cannot be exported at this time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code> if you
     *        specified the <code>name</code> parameter as <code>JobStatus</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specified the <code>name</code>
     * parameter as <code>ResourceType</code>. There is no filter for EBS volumes because volume recommendations cannot
     * be exported at this time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code> if you
     * specified the <code>name</code> parameter as <code>JobStatus</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        The valid values for this parameter are as follows, depending on what you specify for the
     *        <code>name</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specified the <code>name</code>
     *        parameter as <code>ResourceType</code>. There is no filter for EBS volumes because volume recommendations
     *        cannot be exported at this time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code> if you
     *        specified the <code>name</code> parameter as <code>JobStatus</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobFilter == false)
            return false;
        JobFilter other = (JobFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public JobFilter clone() {
        try {
            return (JobFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.JobFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
