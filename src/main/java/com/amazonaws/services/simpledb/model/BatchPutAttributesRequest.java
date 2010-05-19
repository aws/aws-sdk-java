/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Batch Put Attributes Request
 */
public class BatchPutAttributesRequest extends AmazonWebServiceRequest {

    /**
     * The name of the domain to create. The name can range between 3 and 255
     * characters and can contain the following characters: a-z, A-Z, 0-9,
     * '_', '-', and '.'.
     */
    private String domainName;

    /**
     * A list of items on which to perform the operation.
     */
    private java.util.List<ReplaceableItem> items;

    /**
     * Default constructor for a new BatchPutAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public BatchPutAttributesRequest() {}
    
    /**
     * Constructs a new BatchPutAttributesRequest object and initializes the specified
     * object members.  Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain to create. The name can range
     * between 3 and 255 characters and can contain the following characters:
     * a-z, A-Z, 0-9, '_', '-', and '.'.
     * @param items A list of items on which to perform the operation.
     */
    public BatchPutAttributesRequest(String domainName, java.util.List<ReplaceableItem> items) {
        this.domainName = domainName;
        this.items = items;
    }
    
    /**
     * The name of the domain to create. The name can range between 3 and 255
     * characters and can contain the following characters: a-z, A-Z, 0-9,
     * '_', '-', and '.'.
     *
     * @return The name of the domain to create. The name can range between 3 and 255
     *         characters and can contain the following characters: a-z, A-Z, 0-9,
     *         '_', '-', and '.'.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain to create. The name can range between 3 and 255
     * characters and can contain the following characters: a-z, A-Z, 0-9,
     * '_', '-', and '.'.
     *
     * @param domainName The name of the domain to create. The name can range between 3 and 255
     *         characters and can contain the following characters: a-z, A-Z, 0-9,
     *         '_', '-', and '.'.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain to create. The name can range between 3 and 255
     * characters and can contain the following characters: a-z, A-Z, 0-9,
     * '_', '-', and '.'.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The name of the domain to create. The name can range between 3 and 255
     *         characters and can contain the following characters: a-z, A-Z, 0-9,
     *         '_', '-', and '.'.
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
            items = new java.util.ArrayList<ReplaceableItem>();
        }
        return items;
    }
    
    /**
     * A list of items on which to perform the operation.
     *
     * @param items A list of items on which to perform the operation.
     */
    public void setItems(java.util.Collection<ReplaceableItem> items) {
        java.util.List<ReplaceableItem> itemsCopy = new java.util.ArrayList<ReplaceableItem>();
        if (items != null) {
            itemsCopy.addAll(items);
        }
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
        java.util.List<ReplaceableItem> itemsCopy = new java.util.ArrayList<ReplaceableItem>();
        if (items != null) {
            itemsCopy.addAll(items);
        }
        this.items = itemsCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("DomainName: " + domainName + ", ");
        sb.append("Items: " + items + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    