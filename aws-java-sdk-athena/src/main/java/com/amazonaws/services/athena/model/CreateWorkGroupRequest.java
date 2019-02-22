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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateWorkGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The workgroup name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption configuration, if any, used for encrypting query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, the limit for the amount of bytes scanned (cutoff) per query, if it is specified, and
     * whether workgroup's settings (specified with EnforceWorkGroupConfiguration) in the WorkGroupConfiguration
     * override client-side settings. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     */
    private WorkGroupConfiguration configuration;
    /**
     * <p>
     * The workgroup description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The workgroup name.
     * </p>
     * 
     * @param name
     *        The workgroup name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The workgroup name.
     * </p>
     * 
     * @return The workgroup name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The workgroup name.
     * </p>
     * 
     * @param name
     *        The workgroup name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption configuration, if any, used for encrypting query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, the limit for the amount of bytes scanned (cutoff) per query, if it is specified, and
     * whether workgroup's settings (specified with EnforceWorkGroupConfiguration) in the WorkGroupConfiguration
     * override client-side settings. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param configuration
     *        The configuration for the workgroup, which includes the location in Amazon S3 where query results are
     *        stored, the encryption configuration, if any, used for encrypting query results, whether the Amazon
     *        CloudWatch Metrics are enabled for the workgroup, the limit for the amount of bytes scanned (cutoff) per
     *        query, if it is specified, and whether workgroup's settings (specified with EnforceWorkGroupConfiguration)
     *        in the WorkGroupConfiguration override client-side settings. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public void setConfiguration(WorkGroupConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption configuration, if any, used for encrypting query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, the limit for the amount of bytes scanned (cutoff) per query, if it is specified, and
     * whether workgroup's settings (specified with EnforceWorkGroupConfiguration) in the WorkGroupConfiguration
     * override client-side settings. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @return The configuration for the workgroup, which includes the location in Amazon S3 where query results are
     *         stored, the encryption configuration, if any, used for encrypting query results, whether the Amazon
     *         CloudWatch Metrics are enabled for the workgroup, the limit for the amount of bytes scanned (cutoff) per
     *         query, if it is specified, and whether workgroup's settings (specified with
     *         EnforceWorkGroupConfiguration) in the WorkGroupConfiguration override client-side settings. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public WorkGroupConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption configuration, if any, used for encrypting query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, the limit for the amount of bytes scanned (cutoff) per query, if it is specified, and
     * whether workgroup's settings (specified with EnforceWorkGroupConfiguration) in the WorkGroupConfiguration
     * override client-side settings. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param configuration
     *        The configuration for the workgroup, which includes the location in Amazon S3 where query results are
     *        stored, the encryption configuration, if any, used for encrypting query results, whether the Amazon
     *        CloudWatch Metrics are enabled for the workgroup, the limit for the amount of bytes scanned (cutoff) per
     *        query, if it is specified, and whether workgroup's settings (specified with EnforceWorkGroupConfiguration)
     *        in the WorkGroupConfiguration override client-side settings. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkGroupRequest withConfiguration(WorkGroupConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * 
     * @param description
     *        The workgroup description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * 
     * @return The workgroup description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * 
     * @param description
     *        The workgroup description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
     * </p>
     * 
     * @return One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
     * </p>
     * 
     * @param tags
     *        One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
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
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkGroupRequest withTags(Tag... tags) {
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
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
     * </p>
     * 
     * @param tags
     *        One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateWorkGroupRequest == false)
            return false;
        CreateWorkGroupRequest other = (CreateWorkGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkGroupRequest clone() {
        return (CreateWorkGroupRequest) super.clone();
    }

}
