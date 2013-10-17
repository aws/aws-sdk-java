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
 * Container for the parameters to the {@link com.amazonaws.services.simpledb.AmazonSimpleDB#batchDeleteAttributes(BatchDeleteAttributesRequest) BatchDeleteAttributes operation}.
 * <p>
 * Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies. This enables Amazon SimpleDB to optimize
 * requests, which generally yields better throughput.
 * </p>
 * <p>
 * <b>NOTE:</b> If you specify BatchDeleteAttributes without attributes or values, all the attributes for the item are deleted. BatchDeleteAttributes is
 * an idempotent operation; running it multiple times on the same item or attribute doesn't result in an error. The BatchDeleteAttributes operation
 * succeeds or fails in its entirety. There are no partial deletes. You can execute multiple BatchDeleteAttributes operations and other operations in
 * parallel. However, large numbers of concurrent BatchDeleteAttributes calls can result in Service Unavailable (503) responses. This operation is
 * vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method. This operation does not support conditions using
 * Expected.X.Name, Expected.X.Value, or Expected.X.Exists.
 * </p>
 * <p>
 * The following limitations are enforced for this operation:
 * <ul>
 * <li>1 MB request size</li>
 * <li>25 item limit per BatchDeleteAttributes operation</li>
 * 
 * </ul>
 * 
 * </p>
 *
 * @see com.amazonaws.services.simpledb.AmazonSimpleDB#batchDeleteAttributes(BatchDeleteAttributesRequest)
 */
public class BatchDeleteAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain in which the attributes are being deleted.
     */
    private String domainName;

    /**
     * A list of items on which to perform the operation.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DeletableItem> items;

    /**
     * Default constructor for a new BatchDeleteAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public BatchDeleteAttributesRequest() {}
    
    /**
     * Constructs a new BatchDeleteAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain in which the attributes are
     * being deleted.
     * @param items A list of items on which to perform the operation.
     */
    public BatchDeleteAttributesRequest(String domainName, java.util.List<DeletableItem> items) {
        setDomainName(domainName);
        setItems(items);
    }

    /**
     * The name of the domain in which the attributes are being deleted.
     *
     * @return The name of the domain in which the attributes are being deleted.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain in which the attributes are being deleted.
     *
     * @param domainName The name of the domain in which the attributes are being deleted.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain in which the attributes are being deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The name of the domain in which the attributes are being deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchDeleteAttributesRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * A list of items on which to perform the operation.
     *
     * @return A list of items on which to perform the operation.
     */
    public java.util.List<DeletableItem> getItems() {
        if (items == null) {
              items = new com.amazonaws.internal.ListWithAutoConstructFlag<DeletableItem>();
              items.setAutoConstruct(true);
        }
        return items;
    }
    
    /**
     * A list of items on which to perform the operation.
     *
     * @param items A list of items on which to perform the operation.
     */
    public void setItems(java.util.Collection<DeletableItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DeletableItem> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeletableItem>(items.size());
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
    public BatchDeleteAttributesRequest withItems(DeletableItem... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<DeletableItem>(items.length));
        for (DeletableItem value : items) {
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
    public BatchDeleteAttributesRequest withItems(java.util.Collection<DeletableItem> items) {
        if (items == null) {
            this.items = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DeletableItem> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeletableItem>(items.size());
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

        if (obj instanceof BatchDeleteAttributesRequest == false) return false;
        BatchDeleteAttributesRequest other = (BatchDeleteAttributesRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        return true;
    }
    
}
    