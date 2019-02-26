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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A workgroup, which contains a name, description, creation time, state, and other configuration, listed under
 * <a>WorkGroup$Configuration</a>. Each workgroup enables you to isolate queries for you or your group of users from
 * other queries in the same account, to configure the query results location and the encryption configuration (known as
 * workgroup settings), to enable sending query metrics to Amazon CloudWatch, and to establish per-query data usage
 * control limits for all queries in a workgroup. The workgroup settings override is specified in
 * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
 * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/WorkGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The workgroup name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption configuration, if any, used for query results; whether the Amazon CloudWatch Metrics are enabled for
     * the workgroup; whether workgroup settings override client-side settings; and the data usage limit for the amount
     * of data scanned per query, if it is specified. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
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
     * The date and time the workgroup was created.
     * </p>
     */
    private java.util.Date creationTime;

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

    public WorkGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * 
     * @param state
     *        The state of the workgroup: ENABLED or DISABLED.
     * @see WorkGroupState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * 
     * @return The state of the workgroup: ENABLED or DISABLED.
     * @see WorkGroupState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * 
     * @param state
     *        The state of the workgroup: ENABLED or DISABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkGroupState
     */

    public WorkGroup withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * 
     * @param state
     *        The state of the workgroup: ENABLED or DISABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkGroupState
     */

    public WorkGroup withState(WorkGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption configuration, if any, used for query results; whether the Amazon CloudWatch Metrics are enabled for
     * the workgroup; whether workgroup settings override client-side settings; and the data usage limit for the amount
     * of data scanned per query, if it is specified. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param configuration
     *        The configuration of the workgroup, which includes the location in Amazon S3 where query results are
     *        stored, the encryption configuration, if any, used for query results; whether the Amazon CloudWatch
     *        Metrics are enabled for the workgroup; whether workgroup settings override client-side settings; and the
     *        data usage limit for the amount of data scanned per query, if it is specified. The workgroup settings
     *        override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public void setConfiguration(WorkGroupConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption configuration, if any, used for query results; whether the Amazon CloudWatch Metrics are enabled for
     * the workgroup; whether workgroup settings override client-side settings; and the data usage limit for the amount
     * of data scanned per query, if it is specified. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @return The configuration of the workgroup, which includes the location in Amazon S3 where query results are
     *         stored, the encryption configuration, if any, used for query results; whether the Amazon CloudWatch
     *         Metrics are enabled for the workgroup; whether workgroup settings override client-side settings; and the
     *         data usage limit for the amount of data scanned per query, if it is specified. The workgroup settings
     *         override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public WorkGroupConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption configuration, if any, used for query results; whether the Amazon CloudWatch Metrics are enabled for
     * the workgroup; whether workgroup settings override client-side settings; and the data usage limit for the amount
     * of data scanned per query, if it is specified. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param configuration
     *        The configuration of the workgroup, which includes the location in Amazon S3 where query results are
     *        stored, the encryption configuration, if any, used for query results; whether the Amazon CloudWatch
     *        Metrics are enabled for the workgroup; whether workgroup settings override client-side settings; and the
     *        data usage limit for the amount of data scanned per query, if it is specified. The workgroup settings
     *        override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroup withConfiguration(WorkGroupConfiguration configuration) {
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

    public WorkGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time the workgroup was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the workgroup was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the workgroup was created.
     * </p>
     * 
     * @return The date and time the workgroup was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the workgroup was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the workgroup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroup withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkGroup == false)
            return false;
        WorkGroup other = (WorkGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public WorkGroup clone() {
        try {
            return (WorkGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.WorkGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
