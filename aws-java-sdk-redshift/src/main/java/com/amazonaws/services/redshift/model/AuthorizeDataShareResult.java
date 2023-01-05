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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeDataShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeDataShareResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An Amazon Resource Name (ARN) that references the datashare that is owned by a specific namespace of the producer
     * cluster. A datashare ARN is in the
     * <code>arn:aws:redshift:{region}:{account-id}:{datashare}:{namespace-guid}/{datashare-name}</code> format.
     * </p>
     */
    private String dataShareArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the producer.
     * </p>
     */
    private String producerArn;
    /**
     * <p>
     * A value that specifies whether the datashare can be shared to a publicly accessible cluster.
     * </p>
     */
    private Boolean allowPubliclyAccessibleConsumers;
    /**
     * <p>
     * A value that specifies when the datashare has an association between producer and data consumers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DataShareAssociation> dataShareAssociations;
    /**
     * <p>
     * The identifier of a datashare to show its managing entity.
     * </p>
     */
    private String managedBy;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that references the datashare that is owned by a specific namespace of the producer
     * cluster. A datashare ARN is in the
     * <code>arn:aws:redshift:{region}:{account-id}:{datashare}:{namespace-guid}/{datashare-name}</code> format.
     * </p>
     * 
     * @param dataShareArn
     *        An Amazon Resource Name (ARN) that references the datashare that is owned by a specific namespace of the
     *        producer cluster. A datashare ARN is in the
     *        <code>arn:aws:redshift:{region}:{account-id}:{datashare}:{namespace-guid}/{datashare-name}</code> format.
     */

    public void setDataShareArn(String dataShareArn) {
        this.dataShareArn = dataShareArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that references the datashare that is owned by a specific namespace of the producer
     * cluster. A datashare ARN is in the
     * <code>arn:aws:redshift:{region}:{account-id}:{datashare}:{namespace-guid}/{datashare-name}</code> format.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that references the datashare that is owned by a specific namespace of the
     *         producer cluster. A datashare ARN is in the
     *         <code>arn:aws:redshift:{region}:{account-id}:{datashare}:{namespace-guid}/{datashare-name}</code> format.
     */

    public String getDataShareArn() {
        return this.dataShareArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that references the datashare that is owned by a specific namespace of the producer
     * cluster. A datashare ARN is in the
     * <code>arn:aws:redshift:{region}:{account-id}:{datashare}:{namespace-guid}/{datashare-name}</code> format.
     * </p>
     * 
     * @param dataShareArn
     *        An Amazon Resource Name (ARN) that references the datashare that is owned by a specific namespace of the
     *        producer cluster. A datashare ARN is in the
     *        <code>arn:aws:redshift:{region}:{account-id}:{datashare}:{namespace-guid}/{datashare-name}</code> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeDataShareResult withDataShareArn(String dataShareArn) {
        setDataShareArn(dataShareArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the producer.
     * </p>
     * 
     * @param producerArn
     *        The Amazon Resource Name (ARN) of the producer.
     */

    public void setProducerArn(String producerArn) {
        this.producerArn = producerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the producer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the producer.
     */

    public String getProducerArn() {
        return this.producerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the producer.
     * </p>
     * 
     * @param producerArn
     *        The Amazon Resource Name (ARN) of the producer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeDataShareResult withProducerArn(String producerArn) {
        setProducerArn(producerArn);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the datashare can be shared to a publicly accessible cluster.
     * </p>
     * 
     * @param allowPubliclyAccessibleConsumers
     *        A value that specifies whether the datashare can be shared to a publicly accessible cluster.
     */

    public void setAllowPubliclyAccessibleConsumers(Boolean allowPubliclyAccessibleConsumers) {
        this.allowPubliclyAccessibleConsumers = allowPubliclyAccessibleConsumers;
    }

    /**
     * <p>
     * A value that specifies whether the datashare can be shared to a publicly accessible cluster.
     * </p>
     * 
     * @return A value that specifies whether the datashare can be shared to a publicly accessible cluster.
     */

    public Boolean getAllowPubliclyAccessibleConsumers() {
        return this.allowPubliclyAccessibleConsumers;
    }

    /**
     * <p>
     * A value that specifies whether the datashare can be shared to a publicly accessible cluster.
     * </p>
     * 
     * @param allowPubliclyAccessibleConsumers
     *        A value that specifies whether the datashare can be shared to a publicly accessible cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeDataShareResult withAllowPubliclyAccessibleConsumers(Boolean allowPubliclyAccessibleConsumers) {
        setAllowPubliclyAccessibleConsumers(allowPubliclyAccessibleConsumers);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the datashare can be shared to a publicly accessible cluster.
     * </p>
     * 
     * @return A value that specifies whether the datashare can be shared to a publicly accessible cluster.
     */

    public Boolean isAllowPubliclyAccessibleConsumers() {
        return this.allowPubliclyAccessibleConsumers;
    }

    /**
     * <p>
     * A value that specifies when the datashare has an association between producer and data consumers.
     * </p>
     * 
     * @return A value that specifies when the datashare has an association between producer and data consumers.
     */

    public java.util.List<DataShareAssociation> getDataShareAssociations() {
        if (dataShareAssociations == null) {
            dataShareAssociations = new com.amazonaws.internal.SdkInternalList<DataShareAssociation>();
        }
        return dataShareAssociations;
    }

    /**
     * <p>
     * A value that specifies when the datashare has an association between producer and data consumers.
     * </p>
     * 
     * @param dataShareAssociations
     *        A value that specifies when the datashare has an association between producer and data consumers.
     */

    public void setDataShareAssociations(java.util.Collection<DataShareAssociation> dataShareAssociations) {
        if (dataShareAssociations == null) {
            this.dataShareAssociations = null;
            return;
        }

        this.dataShareAssociations = new com.amazonaws.internal.SdkInternalList<DataShareAssociation>(dataShareAssociations);
    }

    /**
     * <p>
     * A value that specifies when the datashare has an association between producer and data consumers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataShareAssociations(java.util.Collection)} or
     * {@link #withDataShareAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataShareAssociations
     *        A value that specifies when the datashare has an association between producer and data consumers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeDataShareResult withDataShareAssociations(DataShareAssociation... dataShareAssociations) {
        if (this.dataShareAssociations == null) {
            setDataShareAssociations(new com.amazonaws.internal.SdkInternalList<DataShareAssociation>(dataShareAssociations.length));
        }
        for (DataShareAssociation ele : dataShareAssociations) {
            this.dataShareAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A value that specifies when the datashare has an association between producer and data consumers.
     * </p>
     * 
     * @param dataShareAssociations
     *        A value that specifies when the datashare has an association between producer and data consumers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeDataShareResult withDataShareAssociations(java.util.Collection<DataShareAssociation> dataShareAssociations) {
        setDataShareAssociations(dataShareAssociations);
        return this;
    }

    /**
     * <p>
     * The identifier of a datashare to show its managing entity.
     * </p>
     * 
     * @param managedBy
     *        The identifier of a datashare to show its managing entity.
     */

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }

    /**
     * <p>
     * The identifier of a datashare to show its managing entity.
     * </p>
     * 
     * @return The identifier of a datashare to show its managing entity.
     */

    public String getManagedBy() {
        return this.managedBy;
    }

    /**
     * <p>
     * The identifier of a datashare to show its managing entity.
     * </p>
     * 
     * @param managedBy
     *        The identifier of a datashare to show its managing entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeDataShareResult withManagedBy(String managedBy) {
        setManagedBy(managedBy);
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
        if (getDataShareArn() != null)
            sb.append("DataShareArn: ").append(getDataShareArn()).append(",");
        if (getProducerArn() != null)
            sb.append("ProducerArn: ").append(getProducerArn()).append(",");
        if (getAllowPubliclyAccessibleConsumers() != null)
            sb.append("AllowPubliclyAccessibleConsumers: ").append(getAllowPubliclyAccessibleConsumers()).append(",");
        if (getDataShareAssociations() != null)
            sb.append("DataShareAssociations: ").append(getDataShareAssociations()).append(",");
        if (getManagedBy() != null)
            sb.append("ManagedBy: ").append(getManagedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeDataShareResult == false)
            return false;
        AuthorizeDataShareResult other = (AuthorizeDataShareResult) obj;
        if (other.getDataShareArn() == null ^ this.getDataShareArn() == null)
            return false;
        if (other.getDataShareArn() != null && other.getDataShareArn().equals(this.getDataShareArn()) == false)
            return false;
        if (other.getProducerArn() == null ^ this.getProducerArn() == null)
            return false;
        if (other.getProducerArn() != null && other.getProducerArn().equals(this.getProducerArn()) == false)
            return false;
        if (other.getAllowPubliclyAccessibleConsumers() == null ^ this.getAllowPubliclyAccessibleConsumers() == null)
            return false;
        if (other.getAllowPubliclyAccessibleConsumers() != null
                && other.getAllowPubliclyAccessibleConsumers().equals(this.getAllowPubliclyAccessibleConsumers()) == false)
            return false;
        if (other.getDataShareAssociations() == null ^ this.getDataShareAssociations() == null)
            return false;
        if (other.getDataShareAssociations() != null && other.getDataShareAssociations().equals(this.getDataShareAssociations()) == false)
            return false;
        if (other.getManagedBy() == null ^ this.getManagedBy() == null)
            return false;
        if (other.getManagedBy() != null && other.getManagedBy().equals(this.getManagedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataShareArn() == null) ? 0 : getDataShareArn().hashCode());
        hashCode = prime * hashCode + ((getProducerArn() == null) ? 0 : getProducerArn().hashCode());
        hashCode = prime * hashCode + ((getAllowPubliclyAccessibleConsumers() == null) ? 0 : getAllowPubliclyAccessibleConsumers().hashCode());
        hashCode = prime * hashCode + ((getDataShareAssociations() == null) ? 0 : getDataShareAssociations().hashCode());
        hashCode = prime * hashCode + ((getManagedBy() == null) ? 0 : getManagedBy().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeDataShareResult clone() {
        try {
            return (AuthorizeDataShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
