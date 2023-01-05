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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An index is the data store used by Amazon Web Services Resource Explorer to hold information about your Amazon Web
 * Services resources that the service discovers. Creating an index in an Amazon Web Services Region turns on Resource
 * Explorer and lets it discover your resources.
 * </p>
 * <p>
 * By default, an index is <i>local</i>, meaning that it contains information about resources in only the same Region as
 * the index. However, you can promote the index of one Region in the account by calling <a>UpdateIndexType</a> to
 * convert it into an aggregator index. The aggregator index receives a replicated copy of the index information from
 * all other Regions where Resource Explorer is turned on. This allows search operations in that Region to return
 * results from all Regions in the account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/Index" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Index implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Web Services Region in which the index exists.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The type of index. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>LOCAL</b> – The index contains information about resources from only the same Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGGREGATOR</b> – Resource Explorer replicates copies of the indexed information about resources in all other
     * Amazon Web Services Regions to the aggregator index. This lets search results in the Region with the aggregator
     * index to include resources from all Regions in the account where Resource Explorer is turned on.
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the index.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Index withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the index exists.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region in which the index exists.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the index exists.
     * </p>
     * 
     * @return The Amazon Web Services Region in which the index exists.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the index exists.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region in which the index exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Index withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The type of index. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>LOCAL</b> – The index contains information about resources from only the same Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGGREGATOR</b> – Resource Explorer replicates copies of the indexed information about resources in all other
     * Amazon Web Services Regions to the aggregator index. This lets search results in the Region with the aggregator
     * index to include resources from all Regions in the account where Resource Explorer is turned on.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of index. It can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>LOCAL</b> – The index contains information about resources from only the same Amazon Web Services
     *        Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AGGREGATOR</b> – Resource Explorer replicates copies of the indexed information about resources in all
     *        other Amazon Web Services Regions to the aggregator index. This lets search results in the Region with the
     *        aggregator index to include resources from all Regions in the account where Resource Explorer is turned
     *        on.
     *        </p>
     *        </li>
     * @see IndexType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of index. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>LOCAL</b> – The index contains information about resources from only the same Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGGREGATOR</b> – Resource Explorer replicates copies of the indexed information about resources in all other
     * Amazon Web Services Regions to the aggregator index. This lets search results in the Region with the aggregator
     * index to include resources from all Regions in the account where Resource Explorer is turned on.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of index. It can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>LOCAL</b> – The index contains information about resources from only the same Amazon Web Services
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AGGREGATOR</b> – Resource Explorer replicates copies of the indexed information about resources in all
     *         other Amazon Web Services Regions to the aggregator index. This lets search results in the Region with
     *         the aggregator index to include resources from all Regions in the account where Resource Explorer is
     *         turned on.
     *         </p>
     *         </li>
     * @see IndexType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of index. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>LOCAL</b> – The index contains information about resources from only the same Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGGREGATOR</b> – Resource Explorer replicates copies of the indexed information about resources in all other
     * Amazon Web Services Regions to the aggregator index. This lets search results in the Region with the aggregator
     * index to include resources from all Regions in the account where Resource Explorer is turned on.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of index. It can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>LOCAL</b> – The index contains information about resources from only the same Amazon Web Services
     *        Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AGGREGATOR</b> – Resource Explorer replicates copies of the indexed information about resources in all
     *        other Amazon Web Services Regions to the aggregator index. This lets search results in the Region with the
     *        aggregator index to include resources from all Regions in the account where Resource Explorer is turned
     *        on.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public Index withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of index. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>LOCAL</b> – The index contains information about resources from only the same Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGGREGATOR</b> – Resource Explorer replicates copies of the indexed information about resources in all other
     * Amazon Web Services Regions to the aggregator index. This lets search results in the Region with the aggregator
     * index to include resources from all Regions in the account where Resource Explorer is turned on.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of index. It can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>LOCAL</b> – The index contains information about resources from only the same Amazon Web Services
     *        Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AGGREGATOR</b> – Resource Explorer replicates copies of the indexed information about resources in all
     *        other Amazon Web Services Regions to the aggregator index. This lets search results in the Region with the
     *        aggregator index to include resources from all Regions in the account where Resource Explorer is turned
     *        on.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public Index withType(IndexType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Index == false)
            return false;
        Index other = (Index) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Index clone() {
        try {
            return (Index) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourceexplorer2.model.transform.IndexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
