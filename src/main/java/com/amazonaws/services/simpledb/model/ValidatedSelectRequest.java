/*
 ===========================================================================
 Copyright (c) 2013 3Pillar Global

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 ===========================================================================

 */
package com.amazonaws.services.simpledb.model;

import com.amazonaws.services.simpledb.parser.SimpleDBParser;

/**
 * Validates each select request according to the format for the <i>Select</i> function
 * as described in the Amazon SimpleDB API.
 *
 * @see com.amazonaws.services.simpledb.model.SelectRequest
 */
public class ValidatedSelectRequest extends SelectRequest {

    /**
     * @see com.amazonaws.services.simpledb.model.SelectRequest#SelectRequest()
     */
    public ValidatedSelectRequest() {
        super();
    }

    /**
     * @see com.amazonaws.services.simpledb.model.SelectRequest#SelectRequest(String)
     */
    public ValidatedSelectRequest(String selectExpression) {
        super(selectExpression);
        validateSelectQuery(selectExpression);
    }

    /**
     * @see com.amazonaws.services.simpledb.model.SelectRequest#setSelectExpression(String)
     */
    public void setSelectExpression(String selectExpression) {
        validateSelectQuery(selectExpression);

        super.setSelectExpression(selectExpression);
    }

    /**
     * @see com.amazonaws.services.simpledb.model.SelectRequest#withSelectExpression(String)
     */
    public SelectRequest withSelectExpression(String selectExpression) {
        validateSelectQuery(selectExpression);

        return super.withSelectExpression(selectExpression);
    }

    /**
     * Validate the give select expression according to the format for the <i>Select</i> function
     * as described in the Amazon SimpleDB API.
     *
     * @param selectExpression The expression used to query the domain.
     */
    private void validateSelectQuery(final String selectExpression) {
        final SimpleDBParser parser = new SimpleDBParser(selectExpression);
        try {
            parser.selectQuery();
        } catch (Exception e) {
            throw new InvalidQueryExpressionException("The following query is an invalid SimpleDB query: " + selectExpression, e);
        }
    }
}
