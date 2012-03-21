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

/**
 * Batch Get Item Result
 */
public class BatchGetItemResult {

    /**
     * Table names and the respective item attributes from the tables.
     */
    private java.util.Map<String,BatchResponse> responses;

    /**
     * Contains a map of tables and their respective keys that were not
     * processed with the current response, possibly due to reaching a limit
     * on the response size. The <code>UnprocessedKeys</code> value is in the
     * same form as a <code>RequestItems</code> parameter (so the value can
     * be provided directly to a subsequent <code>BatchGetItem</code>
     * operation). For more information, see the above
     * <code>RequestItems</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private java.util.Map<String,KeysAndAttributes> unprocessedKeys;

    /**
     * Table names and the respective item attributes from the tables.
     *
     * @return Table names and the respective item attributes from the tables.
     */
    public java.util.Map<String,BatchResponse> getResponses() {
        
        return responses;
    }
    
    /**
     * Table names and the respective item attributes from the tables.
     *
     * @param responses Table names and the respective item attributes from the tables.
     */
    public void setResponses(java.util.Map<String,BatchResponse> responses) {
        this.responses = responses;
    }
    
    /**
     * Table names and the respective item attributes from the tables.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param responses Table names and the respective item attributes from the tables.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemResult withResponses(java.util.Map<String,BatchResponse> responses) {
        setResponses(responses);
        return this;
    }
    
    /**
     * Contains a map of tables and their respective keys that were not
     * processed with the current response, possibly due to reaching a limit
     * on the response size. The <code>UnprocessedKeys</code> value is in the
     * same form as a <code>RequestItems</code> parameter (so the value can
     * be provided directly to a subsequent <code>BatchGetItem</code>
     * operation). For more information, see the above
     * <code>RequestItems</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return Contains a map of tables and their respective keys that were not
     *         processed with the current response, possibly due to reaching a limit
     *         on the response size. The <code>UnprocessedKeys</code> value is in the
     *         same form as a <code>RequestItems</code> parameter (so the value can
     *         be provided directly to a subsequent <code>BatchGetItem</code>
     *         operation). For more information, see the above
     *         <code>RequestItems</code> parameter.
     */
    public java.util.Map<String,KeysAndAttributes> getUnprocessedKeys() {
        
        return unprocessedKeys;
    }
    
    /**
     * Contains a map of tables and their respective keys that were not
     * processed with the current response, possibly due to reaching a limit
     * on the response size. The <code>UnprocessedKeys</code> value is in the
     * same form as a <code>RequestItems</code> parameter (so the value can
     * be provided directly to a subsequent <code>BatchGetItem</code>
     * operation). For more information, see the above
     * <code>RequestItems</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param unprocessedKeys Contains a map of tables and their respective keys that were not
     *         processed with the current response, possibly due to reaching a limit
     *         on the response size. The <code>UnprocessedKeys</code> value is in the
     *         same form as a <code>RequestItems</code> parameter (so the value can
     *         be provided directly to a subsequent <code>BatchGetItem</code>
     *         operation). For more information, see the above
     *         <code>RequestItems</code> parameter.
     */
    public void setUnprocessedKeys(java.util.Map<String,KeysAndAttributes> unprocessedKeys) {
        this.unprocessedKeys = unprocessedKeys;
    }
    
    /**
     * Contains a map of tables and their respective keys that were not
     * processed with the current response, possibly due to reaching a limit
     * on the response size. The <code>UnprocessedKeys</code> value is in the
     * same form as a <code>RequestItems</code> parameter (so the value can
     * be provided directly to a subsequent <code>BatchGetItem</code>
     * operation). For more information, see the above
     * <code>RequestItems</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param unprocessedKeys Contains a map of tables and their respective keys that were not
     *         processed with the current response, possibly due to reaching a limit
     *         on the response size. The <code>UnprocessedKeys</code> value is in the
     *         same form as a <code>RequestItems</code> parameter (so the value can
     *         be provided directly to a subsequent <code>BatchGetItem</code>
     *         operation). For more information, see the above
     *         <code>RequestItems</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemResult withUnprocessedKeys(java.util.Map<String,KeysAndAttributes> unprocessedKeys) {
        setUnprocessedKeys(unprocessedKeys);
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
        if (responses != null) sb.append("Responses: " + responses + ", ");
        if (unprocessedKeys != null) sb.append("UnprocessedKeys: " + unprocessedKeys + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode()); 
        hashCode = prime * hashCode + ((getUnprocessedKeys() == null) ? 0 : getUnprocessedKeys().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof BatchGetItemResult == false) return false;
        BatchGetItemResult other = (BatchGetItemResult)obj;
        
        if (other.getResponses() == null ^ this.getResponses() == null) return false;
        if (other.getResponses() != null && other.getResponses().equals(this.getResponses()) == false) return false; 
        if (other.getUnprocessedKeys() == null ^ this.getUnprocessedKeys() == null) return false;
        if (other.getUnprocessedKeys() != null && other.getUnprocessedKeys().equals(this.getUnprocessedKeys()) == false) return false; 
        return true;
    }
    
}
    