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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
 * streams, TTL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/SourceTableFeatureDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceTableFeatureDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and
     * Projection for the LSIs on the table at the time of backup.
     * </p>
     */
    private java.util.List<LocalSecondaryIndexInfo> localSecondaryIndexes;
    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema,
     * Projection and ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndexInfo> globalSecondaryIndexes;
    /**
     * <p>
     * Stream settings on the table when the backup was created.
     * </p>
     */
    private StreamSpecification streamDescription;
    /**
     * <p>
     * Time to Live settings on the table when the backup was created.
     * </p>
     */
    private TimeToLiveDescription timeToLiveDescription;
    /**
     * <p>
     * The description of the server-side encryption status on the table when the backup was created.
     * </p>
     */
    private SSEDescription sSEDescription;

    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and
     * Projection for the LSIs on the table at the time of backup.
     * </p>
     * 
     * @return Represents the LSI properties for the table when the backup was created. It includes the IndexName,
     *         KeySchema and Projection for the LSIs on the table at the time of backup.
     */

    public java.util.List<LocalSecondaryIndexInfo> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and
     * Projection for the LSIs on the table at the time of backup.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        Represents the LSI properties for the table when the backup was created. It includes the IndexName,
     *        KeySchema and Projection for the LSIs on the table at the time of backup.
     */

    public void setLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndexInfo> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
            return;
        }

        this.localSecondaryIndexes = new java.util.ArrayList<LocalSecondaryIndexInfo>(localSecondaryIndexes);
    }

    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and
     * Projection for the LSIs on the table at the time of backup.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalSecondaryIndexes(java.util.Collection)} or
     * {@link #withLocalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        Represents the LSI properties for the table when the backup was created. It includes the IndexName,
     *        KeySchema and Projection for the LSIs on the table at the time of backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableFeatureDetails withLocalSecondaryIndexes(LocalSecondaryIndexInfo... localSecondaryIndexes) {
        if (this.localSecondaryIndexes == null) {
            setLocalSecondaryIndexes(new java.util.ArrayList<LocalSecondaryIndexInfo>(localSecondaryIndexes.length));
        }
        for (LocalSecondaryIndexInfo ele : localSecondaryIndexes) {
            this.localSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and
     * Projection for the LSIs on the table at the time of backup.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        Represents the LSI properties for the table when the backup was created. It includes the IndexName,
     *        KeySchema and Projection for the LSIs on the table at the time of backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableFeatureDetails withLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndexInfo> localSecondaryIndexes) {
        setLocalSecondaryIndexes(localSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema,
     * Projection and ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     * 
     * @return Represents the GSI properties for the table when the backup was created. It includes the IndexName,
     *         KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup.
     */

    public java.util.List<GlobalSecondaryIndexInfo> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema,
     * Projection and ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        Represents the GSI properties for the table when the backup was created. It includes the IndexName,
     *        KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup.
     */

    public void setGlobalSecondaryIndexes(java.util.Collection<GlobalSecondaryIndexInfo> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<GlobalSecondaryIndexInfo>(globalSecondaryIndexes);
    }

    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema,
     * Projection and ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexes(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        Represents the GSI properties for the table when the backup was created. It includes the IndexName,
     *        KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableFeatureDetails withGlobalSecondaryIndexes(GlobalSecondaryIndexInfo... globalSecondaryIndexes) {
        if (this.globalSecondaryIndexes == null) {
            setGlobalSecondaryIndexes(new java.util.ArrayList<GlobalSecondaryIndexInfo>(globalSecondaryIndexes.length));
        }
        for (GlobalSecondaryIndexInfo ele : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema,
     * Projection and ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        Represents the GSI properties for the table when the backup was created. It includes the IndexName,
     *        KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableFeatureDetails withGlobalSecondaryIndexes(java.util.Collection<GlobalSecondaryIndexInfo> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * Stream settings on the table when the backup was created.
     * </p>
     * 
     * @param streamDescription
     *        Stream settings on the table when the backup was created.
     */

    public void setStreamDescription(StreamSpecification streamDescription) {
        this.streamDescription = streamDescription;
    }

    /**
     * <p>
     * Stream settings on the table when the backup was created.
     * </p>
     * 
     * @return Stream settings on the table when the backup was created.
     */

    public StreamSpecification getStreamDescription() {
        return this.streamDescription;
    }

    /**
     * <p>
     * Stream settings on the table when the backup was created.
     * </p>
     * 
     * @param streamDescription
     *        Stream settings on the table when the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableFeatureDetails withStreamDescription(StreamSpecification streamDescription) {
        setStreamDescription(streamDescription);
        return this;
    }

    /**
     * <p>
     * Time to Live settings on the table when the backup was created.
     * </p>
     * 
     * @param timeToLiveDescription
     *        Time to Live settings on the table when the backup was created.
     */

    public void setTimeToLiveDescription(TimeToLiveDescription timeToLiveDescription) {
        this.timeToLiveDescription = timeToLiveDescription;
    }

    /**
     * <p>
     * Time to Live settings on the table when the backup was created.
     * </p>
     * 
     * @return Time to Live settings on the table when the backup was created.
     */

    public TimeToLiveDescription getTimeToLiveDescription() {
        return this.timeToLiveDescription;
    }

    /**
     * <p>
     * Time to Live settings on the table when the backup was created.
     * </p>
     * 
     * @param timeToLiveDescription
     *        Time to Live settings on the table when the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableFeatureDetails withTimeToLiveDescription(TimeToLiveDescription timeToLiveDescription) {
        setTimeToLiveDescription(timeToLiveDescription);
        return this;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the table when the backup was created.
     * </p>
     * 
     * @param sSEDescription
     *        The description of the server-side encryption status on the table when the backup was created.
     */

    public void setSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the table when the backup was created.
     * </p>
     * 
     * @return The description of the server-side encryption status on the table when the backup was created.
     */

    public SSEDescription getSSEDescription() {
        return this.sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the table when the backup was created.
     * </p>
     * 
     * @param sSEDescription
     *        The description of the server-side encryption status on the table when the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableFeatureDetails withSSEDescription(SSEDescription sSEDescription) {
        setSSEDescription(sSEDescription);
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
        if (getLocalSecondaryIndexes() != null)
            sb.append("LocalSecondaryIndexes: ").append(getLocalSecondaryIndexes()).append(",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: ").append(getGlobalSecondaryIndexes()).append(",");
        if (getStreamDescription() != null)
            sb.append("StreamDescription: ").append(getStreamDescription()).append(",");
        if (getTimeToLiveDescription() != null)
            sb.append("TimeToLiveDescription: ").append(getTimeToLiveDescription()).append(",");
        if (getSSEDescription() != null)
            sb.append("SSEDescription: ").append(getSSEDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceTableFeatureDetails == false)
            return false;
        SourceTableFeatureDetails other = (SourceTableFeatureDetails) obj;
        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null)
            return false;
        if (other.getLocalSecondaryIndexes() != null && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        if (other.getStreamDescription() == null ^ this.getStreamDescription() == null)
            return false;
        if (other.getStreamDescription() != null && other.getStreamDescription().equals(this.getStreamDescription()) == false)
            return false;
        if (other.getTimeToLiveDescription() == null ^ this.getTimeToLiveDescription() == null)
            return false;
        if (other.getTimeToLiveDescription() != null && other.getTimeToLiveDescription().equals(this.getTimeToLiveDescription()) == false)
            return false;
        if (other.getSSEDescription() == null ^ this.getSSEDescription() == null)
            return false;
        if (other.getSSEDescription() != null && other.getSSEDescription().equals(this.getSSEDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode + ((getStreamDescription() == null) ? 0 : getStreamDescription().hashCode());
        hashCode = prime * hashCode + ((getTimeToLiveDescription() == null) ? 0 : getTimeToLiveDescription().hashCode());
        hashCode = prime * hashCode + ((getSSEDescription() == null) ? 0 : getSSEDescription().hashCode());
        return hashCode;
    }

    @Override
    public SourceTableFeatureDetails clone() {
        try {
            return (SourceTableFeatureDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.SourceTableFeatureDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
