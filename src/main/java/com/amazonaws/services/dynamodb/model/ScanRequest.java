/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#scan(ScanRequest) Scan operation}.
 * <p>
 * Retrieves one or more items and its attributes by performing a full scan of a table.
 * </p>
 * <p>
 * Provide a <code>ScanFilter</code> to get more specific results.
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#scan(ScanRequest)
 */
public class ScanRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table in which you want to scan. Allowed characters
     * are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<String> attributesToGet;

    /**
     * The maximum number of items to return. If Amazon DynamoDB hits this
     * limit while scanning the table, it stops the scan and returns the
     * matching values up to the limit, and a <code>LastEvaluatedKey</code>
     * to apply in a subsequent operation to continue the scan. Also, if the
     * scanned data set size exceeds 1 MB before Amazon DynamoDB hits this
     * limit, it stops the scan and returns the matching values up to the
     * limit, and a <code>LastEvaluatedKey</code> to apply in a subsequent
     * operation to continue the scan.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items for the <code>Scan</code> operation, even if the operation has
     * no matching items for the assigned filter. Do not set
     * <code>Count</code> to <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     */
    private Boolean count;

    /**
     * Evaluates the scan results and returns only the desired values.
     */
    private java.util.Map<String,Condition> scanFilter;

    /**
     * Primary key of the item from which to continue an earlier scan. An
     * earlier scan might provide this value if that scan operation was
     * interrupted before scanning the entire table; either because of the
     * result set size or the <code>Limit</code> parameter. The
     * <code>LastEvaluatedKey</code> can be passed back in a new scan request
     * to continue the operation from that point.
     */
    private Key exclusiveStartKey;

    /**
     * Default constructor for a new ScanRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ScanRequest() {}
    
    /**
     * Constructs a new ScanRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table in which you want to scan.
     * Allowed characters are <code>a-z</code>, <code>A-Z</code>,
     * <code>0-9</code>, <code>_</code> (underscore), <code>-</code> (hyphen)
     * and <code>.</code> (period).
     */
    public ScanRequest(String tableName) {
        this.tableName = tableName;
    }

    
    
    /**
     * The name of the table in which you want to scan. Allowed characters
     * are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table in which you want to scan. Allowed characters
     *         are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table in which you want to scan. Allowed characters
     * are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table in which you want to scan. Allowed characters
     *         are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table in which you want to scan. Allowed characters
     * are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table in which you want to scan. Allowed characters
     *         are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     */
    public java.util.List<String> getAttributesToGet() {
        
        return attributesToGet;
    }
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }
    
    /**
     * The maximum number of items to return. If Amazon DynamoDB hits this
     * limit while scanning the table, it stops the scan and returns the
     * matching values up to the limit, and a <code>LastEvaluatedKey</code>
     * to apply in a subsequent operation to continue the scan. Also, if the
     * scanned data set size exceeds 1 MB before Amazon DynamoDB hits this
     * limit, it stops the scan and returns the matching values up to the
     * limit, and a <code>LastEvaluatedKey</code> to apply in a subsequent
     * operation to continue the scan.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The maximum number of items to return. If Amazon DynamoDB hits this
     *         limit while scanning the table, it stops the scan and returns the
     *         matching values up to the limit, and a <code>LastEvaluatedKey</code>
     *         to apply in a subsequent operation to continue the scan. Also, if the
     *         scanned data set size exceeds 1 MB before Amazon DynamoDB hits this
     *         limit, it stops the scan and returns the matching values up to the
     *         limit, and a <code>LastEvaluatedKey</code> to apply in a subsequent
     *         operation to continue the scan.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of items to return. If Amazon DynamoDB hits this
     * limit while scanning the table, it stops the scan and returns the
     * matching values up to the limit, and a <code>LastEvaluatedKey</code>
     * to apply in a subsequent operation to continue the scan. Also, if the
     * scanned data set size exceeds 1 MB before Amazon DynamoDB hits this
     * limit, it stops the scan and returns the matching values up to the
     * limit, and a <code>LastEvaluatedKey</code> to apply in a subsequent
     * operation to continue the scan.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The maximum number of items to return. If Amazon DynamoDB hits this
     *         limit while scanning the table, it stops the scan and returns the
     *         matching values up to the limit, and a <code>LastEvaluatedKey</code>
     *         to apply in a subsequent operation to continue the scan. Also, if the
     *         scanned data set size exceeds 1 MB before Amazon DynamoDB hits this
     *         limit, it stops the scan and returns the matching values up to the
     *         limit, and a <code>LastEvaluatedKey</code> to apply in a subsequent
     *         operation to continue the scan.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of items to return. If Amazon DynamoDB hits this
     * limit while scanning the table, it stops the scan and returns the
     * matching values up to the limit, and a <code>LastEvaluatedKey</code>
     * to apply in a subsequent operation to continue the scan. Also, if the
     * scanned data set size exceeds 1 MB before Amazon DynamoDB hits this
     * limit, it stops the scan and returns the matching values up to the
     * limit, and a <code>LastEvaluatedKey</code> to apply in a subsequent
     * operation to continue the scan.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The maximum number of items to return. If Amazon DynamoDB hits this
     *         limit while scanning the table, it stops the scan and returns the
     *         matching values up to the limit, and a <code>LastEvaluatedKey</code>
     *         to apply in a subsequent operation to continue the scan. Also, if the
     *         scanned data set size exceeds 1 MB before Amazon DynamoDB hits this
     *         limit, it stops the scan and returns the matching values up to the
     *         limit, and a <code>LastEvaluatedKey</code> to apply in a subsequent
     *         operation to continue the scan.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    
    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items for the <code>Scan</code> operation, even if the operation has
     * no matching items for the assigned filter. Do not set
     * <code>Count</code> to <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     *
     * @return If set to <code>true</code>, Amazon DynamoDB returns a total number of
     *         items for the <code>Scan</code> operation, even if the operation has
     *         no matching items for the assigned filter. Do not set
     *         <code>Count</code> to <code>true</code> while providing a list of
     *         <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     *         validation error.
     */
    public Boolean isCount() {
        return count;
    }
    
    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items for the <code>Scan</code> operation, even if the operation has
     * no matching items for the assigned filter. Do not set
     * <code>Count</code> to <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     *
     * @param count If set to <code>true</code>, Amazon DynamoDB returns a total number of
     *         items for the <code>Scan</code> operation, even if the operation has
     *         no matching items for the assigned filter. Do not set
     *         <code>Count</code> to <code>true</code> while providing a list of
     *         <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     *         validation error.
     */
    public void setCount(Boolean count) {
        this.count = count;
    }
    
    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items for the <code>Scan</code> operation, even if the operation has
     * no matching items for the assigned filter. Do not set
     * <code>Count</code> to <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count If set to <code>true</code>, Amazon DynamoDB returns a total number of
     *         items for the <code>Scan</code> operation, even if the operation has
     *         no matching items for the assigned filter. Do not set
     *         <code>Count</code> to <code>true</code> while providing a list of
     *         <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     *         validation error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withCount(Boolean count) {
        this.count = count;
        return this;
    }
    
    
    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items for the <code>Scan</code> operation, even if the operation has
     * no matching items for the assigned filter. Do not set
     * <code>Count</code> to <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     *
     * @return If set to <code>true</code>, Amazon DynamoDB returns a total number of
     *         items for the <code>Scan</code> operation, even if the operation has
     *         no matching items for the assigned filter. Do not set
     *         <code>Count</code> to <code>true</code> while providing a list of
     *         <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     *         validation error.
     */
    public Boolean getCount() {
        return count;
    }
    
    /**
     * Evaluates the scan results and returns only the desired values.
     *
     * @return Evaluates the scan results and returns only the desired values.
     */
    public java.util.Map<String,Condition> getScanFilter() {
        
        return scanFilter;
    }
    
    /**
     * Evaluates the scan results and returns only the desired values.
     *
     * @param scanFilter Evaluates the scan results and returns only the desired values.
     */
    public void setScanFilter(java.util.Map<String,Condition> scanFilter) {
        this.scanFilter = scanFilter;
    }
    
    /**
     * Evaluates the scan results and returns only the desired values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scanFilter Evaluates the scan results and returns only the desired values.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withScanFilter(java.util.Map<String,Condition> scanFilter) {
        setScanFilter(scanFilter);
        return this;
    }
    
    /**
     * Primary key of the item from which to continue an earlier scan. An
     * earlier scan might provide this value if that scan operation was
     * interrupted before scanning the entire table; either because of the
     * result set size or the <code>Limit</code> parameter. The
     * <code>LastEvaluatedKey</code> can be passed back in a new scan request
     * to continue the operation from that point.
     *
     * @return Primary key of the item from which to continue an earlier scan. An
     *         earlier scan might provide this value if that scan operation was
     *         interrupted before scanning the entire table; either because of the
     *         result set size or the <code>Limit</code> parameter. The
     *         <code>LastEvaluatedKey</code> can be passed back in a new scan request
     *         to continue the operation from that point.
     */
    public Key getExclusiveStartKey() {
        return exclusiveStartKey;
    }
    
    /**
     * Primary key of the item from which to continue an earlier scan. An
     * earlier scan might provide this value if that scan operation was
     * interrupted before scanning the entire table; either because of the
     * result set size or the <code>Limit</code> parameter. The
     * <code>LastEvaluatedKey</code> can be passed back in a new scan request
     * to continue the operation from that point.
     *
     * @param exclusiveStartKey Primary key of the item from which to continue an earlier scan. An
     *         earlier scan might provide this value if that scan operation was
     *         interrupted before scanning the entire table; either because of the
     *         result set size or the <code>Limit</code> parameter. The
     *         <code>LastEvaluatedKey</code> can be passed back in a new scan request
     *         to continue the operation from that point.
     */
    public void setExclusiveStartKey(Key exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }
    
    /**
     * Primary key of the item from which to continue an earlier scan. An
     * earlier scan might provide this value if that scan operation was
     * interrupted before scanning the entire table; either because of the
     * result set size or the <code>Limit</code> parameter. The
     * <code>LastEvaluatedKey</code> can be passed back in a new scan request
     * to continue the operation from that point.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exclusiveStartKey Primary key of the item from which to continue an earlier scan. An
     *         earlier scan might provide this value if that scan operation was
     *         interrupted before scanning the entire table; either because of the
     *         result set size or the <code>Limit</code> parameter. The
     *         <code>LastEvaluatedKey</code> can be passed back in a new scan request
     *         to continue the operation from that point.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withExclusiveStartKey(Key exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
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
        if (tableName != null) sb.append("TableName: " + tableName + ", ");
        if (attributesToGet != null) sb.append("AttributesToGet: " + attributesToGet + ", ");
        if (limit != null) sb.append("Limit: " + limit + ", ");
        if (count != null) sb.append("Count: " + count + ", ");
        if (scanFilter != null) sb.append("ScanFilter: " + scanFilter + ", ");
        if (exclusiveStartKey != null) sb.append("ExclusiveStartKey: " + exclusiveStartKey + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((isCount() == null) ? 0 : isCount().hashCode()); 
        hashCode = prime * hashCode + ((getScanFilter() == null) ? 0 : getScanFilter().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ScanRequest == false) return false;
        ScanRequest other = (ScanRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.isCount() == null ^ this.isCount() == null) return false;
        if (other.isCount() != null && other.isCount().equals(this.isCount()) == false) return false; 
        if (other.getScanFilter() == null ^ this.getScanFilter() == null) return false;
        if (other.getScanFilter() != null && other.getScanFilter().equals(this.getScanFilter()) == false) return false; 
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null) return false;
        if (other.getExclusiveStartKey() != null && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false) return false; 
        return true;
    }
    
}
    