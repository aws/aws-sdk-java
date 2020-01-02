/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.dynamodbv2.pojos;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBVersionAttribute;

public class MultiVersionRangeKeyClass extends RangeKeyClass {

    private Long version2;

    @DynamoDBVersionAttribute
    public Long getVersion2() {
        return version2;
    }

    public void setVersion2(Long version2) {
        this.version2 = version2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((version2 == null) ? 0 : version2.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj )
            return true;
        if ( !super.equals(obj) )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        MultiVersionRangeKeyClass other = (MultiVersionRangeKeyClass) obj;
        if ( version2 == null ) {
            if ( other.version2 != null )
                return false;
        } else if ( !version2.equals(other.version2) )
            return false;
        return true;
    }
}
