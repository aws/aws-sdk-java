/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * Put Log Events Result
 */
public class PutLogEventsResult implements Serializable {

    /**
     * A string token used for making PutLogEvents requests. A <code
     * class="code">sequenceToken</code> can only be used once, and
     * PutLogEvents requests must include the <code
     * class="code">sequenceToken</code> obtained from the response of the
     * previous request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextSequenceToken;

    /**
     * A string token used for making PutLogEvents requests. A <code
     * class="code">sequenceToken</code> can only be used once, and
     * PutLogEvents requests must include the <code
     * class="code">sequenceToken</code> obtained from the response of the
     * previous request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A string token used for making PutLogEvents requests. A <code
     *         class="code">sequenceToken</code> can only be used once, and
     *         PutLogEvents requests must include the <code
     *         class="code">sequenceToken</code> obtained from the response of the
     *         previous request.
     */
    public String getNextSequenceToken() {
        return nextSequenceToken;
    }
    
    /**
     * A string token used for making PutLogEvents requests. A <code
     * class="code">sequenceToken</code> can only be used once, and
     * PutLogEvents requests must include the <code
     * class="code">sequenceToken</code> obtained from the response of the
     * previous request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextSequenceToken A string token used for making PutLogEvents requests. A <code
     *         class="code">sequenceToken</code> can only be used once, and
     *         PutLogEvents requests must include the <code
     *         class="code">sequenceToken</code> obtained from the response of the
     *         previous request.
     */
    public void setNextSequenceToken(String nextSequenceToken) {
        this.nextSequenceToken = nextSequenceToken;
    }
    
    /**
     * A string token used for making PutLogEvents requests. A <code
     * class="code">sequenceToken</code> can only be used once, and
     * PutLogEvents requests must include the <code
     * class="code">sequenceToken</code> obtained from the response of the
     * previous request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextSequenceToken A string token used for making PutLogEvents requests. A <code
     *         class="code">sequenceToken</code> can only be used once, and
     *         PutLogEvents requests must include the <code
     *         class="code">sequenceToken</code> obtained from the response of the
     *         previous request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLogEventsResult withNextSequenceToken(String nextSequenceToken) {
        this.nextSequenceToken = nextSequenceToken;
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
        if (getNextSequenceToken() != null) sb.append("NextSequenceToken: " + getNextSequenceToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextSequenceToken() == null) ? 0 : getNextSequenceToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutLogEventsResult == false) return false;
        PutLogEventsResult other = (PutLogEventsResult)obj;
        
        if (other.getNextSequenceToken() == null ^ this.getNextSequenceToken() == null) return false;
        if (other.getNextSequenceToken() != null && other.getNextSequenceToken().equals(this.getNextSequenceToken()) == false) return false; 
        return true;
    }
    
}
    