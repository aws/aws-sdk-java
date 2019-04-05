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
package com.amazonaws.services.polly.model;

import javax.annotation.Generated;

/**
 * <p>
 * Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its name is
 * misspelled or specifying a lexicon that is in a different region.
 * </p>
 * <p>
 * Verify that the lexicon exists, is in the region (see <a>ListLexicons</a>) and that you spelled its name is spelled
 * correctly. Then try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LexiconNotFoundException extends com.amazonaws.services.polly.model.AmazonPollyException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LexiconNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LexiconNotFoundException(String message) {
        super(message);
    }

}
