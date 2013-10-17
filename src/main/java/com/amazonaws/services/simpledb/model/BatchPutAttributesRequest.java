/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpledb.AmazonSimpleDB#batchPutAttributes(BatchPutAttributesRequest) BatchPutAttributes operation}.
 * <p>
 * The <code>BatchPutAttributes</code> operation creates or replaces attributes within one or more items. By using this operation, the client can
 * perform multiple PutAttribute operation with a single call. This helps yield savings in round trips and latencies, enabling Amazon SimpleDB to
 * optimize requests and generally produce better throughput.
 * </p>
 * <p>
 * The client may specify the item name with the <code>Item.X.ItemName</code> parameter. The client may specify new attributes using a combination of
 * the <code>Item.X.Attribute.Y.Name</code> and <code>Item.X.Attribute.Y.Value</code> parameters. The client may specify the first attribute for the
 * first item using the parameters <code>Item.0.Attribute.0.Name</code> and <code>Item.0.Attribute.0.Value</code> ,
 * and for the second attribute for the first item by the parameters <code>Item.0.Attribute.1.Name</code> and <code>Item.0.Attribute.1.Value</code> ,
 * and so on.
 * </p>
 * <p>
 * Attributes are uniquely identified within an item by their name/value combination. For example, a single item can have the attributes <code>{
 * "first_name", "first_value" }</code> and <code>{ "first_name", "second_value" }</code> .
 * However, it cannot have two attribute instances where both the <code>Item.X.Attribute.Y.Name</code> and <code>Item.X.Attribute.Y.Value</code> are
 * the same.
 * </p>
 * <p>
 * Optionally, the requester can supply the <code>Replace</code> parameter for each individual value. Setting this value to <code>true</code> will cause
 * the new attribute values to replace the existing attribute values. For example, if an item <code>I</code> has the attributes <code>{ 'a', '1' }, {
 * 'b', '2'}</code> and <code>{ 'b', '3' }</code> and the requester does a BatchPutAttributes of <code>{'I', 'b', '4' }</code> with the Replace parameter
 * set to true, the final attributes of the item will be <code>{ 'a', '1' }</code> and <code>{ 'b', '4' }</code> ,
 * replacing the previous values of the 'b' attribute with the new value.
 * </p>
 * <p>
 * <b>NOTE:</b> You cannot specify an empty string as an item or as an attribute name. The BatchPutAttributes operation succeeds or fails in its
 * entirety. There are no partial puts.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> This operation is vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method. This operation
 * does not support conditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists.
 * </p>
 * <p>
 * You can execute multiple <code>BatchPutAttributes</code> operations and other operations in parallel. However, large numbers of concurrent
 * <code>BatchPutAttributes</code> calls can result in Service Unavailable (503) responses.
 * </p>
 * <p>
 * The following limitations are enforced for this operation:
 * <ul>
 * <li>256 attribute name-value pairs per item</li>
 * <li>1 MB request size</li>
 * <li>1 billion attributes per domain</li>
 * <li>10 GB of total user data storage per domain</li>
 * <li>25 item limit per <code>BatchPutAttributes</code> operation</li>
 * 
 * </ul>
 * 
 * </p>
 *
 * @see com.amazonaws.services.simpledb.AmazonSimpleDB#batchPutAttributes(BatchPutAttributesRequest)
 */
public class BatchPutAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain in which the attributes are being stored.
     */
    private String domainName;

    /**
     * A list of items on which to perform the operation.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableItem> items;

    /**
     * Default constructor for a new BatchPutAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public BatchPutAttributesRequest() {}
    
    /**
     * Constructs a new BatchPutAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain in which the attributes are
     * being stored.
     * @param items A list of items on which to perform the operation.
     */
    public BatchPutAttributesRequest(String domainName, java.util.List<ReplaceableItem> items) {
        setDomainName(domainName);
        setItems(items);
    }

    /**
     * The name of the domain in which the attributes are being stored.
     *
     * @return The name of the domain in which the attributes are being stored.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain in which the attributes are being stored.
     *
     * @param domainName The name of the domain in which the attributes are being stored.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain in which the attributes are being stored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The name of the domain in which the attributes are being stored.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchPutAttributesRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * A list of items on which to perform the operation.
     *
     * @return A list of items on which to perform the operation.
     */
    public java.util.List<ReplaceableItem> getItems() {
        if (items == null) {
              items = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableItem>();
              items.setAutoConstruct(true);
        }
        return items;
    }
    
    /**
     * A list of items on which to perform the operation.
     *
     * @param items A list of items on which to perform the operation.
     */
    public void setItems(java.util.Collection<ReplaceableItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableItem> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableItem>(items.size());
        itemsCopy.addAll(items);
        this.items = itemsCopy;
    }
    
    /**
     * A list of items on which to perform the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A list of items on which to perform the operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchPutAttributesRequest withItems(ReplaceableItem... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<ReplaceableItem>(items.length));
        for (ReplaceableItem value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * A list of items on which to perform the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A list of items on which to perform the operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchPutAttributesRequest withItems(java.util.Collection<ReplaceableItem> items) {
        if (items == null) {
            this.items = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableItem> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableItem>(items.size());
            itemsCopy.addAll(items);
            this.items = itemsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getItems() != null) sb.append("Items: " + getItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchPutAttributesRequest == false) return false;
        BatchPutAttributesRequest other = (BatchPutAttributesRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        return true;
    }
    
}
    