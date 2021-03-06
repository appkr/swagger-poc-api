/**
 * DB-LOCK-POC
 * 라라벨에 스웨거 적용 테스트를 위한 프로젝트
 *
 * OpenAPI spec version: 1
 * Contact: juwonkim@me.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */


import ApiClient from '../ApiClient';





/**
* The ErrorDto model module.
* @module model/ErrorDto
* @version 1
*/
export default class ErrorDto {
    /**
    * Constructs a new <code>ErrorDto</code>.
    * @alias module:model/ErrorDto
    * @class
    * @param code {Number} 에러 코드
    * @param message {String} 에러 메시지
    */

    constructor(code, message) {
        

        
        

        this['code'] = code;this['message'] = message;

        
    }

    /**
    * Constructs a <code>ErrorDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ErrorDto} obj Optional instance to populate.
    * @return {module:model/ErrorDto} The populated <code>ErrorDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorDto();

            
            
            

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'Number');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
        }
        return obj;
    }

    /**
    * 에러 코드
    * @member {Number} code
    */
    code = undefined;
    /**
    * 에러 메시지
    * @member {String} message
    */
    message = undefined;
    /**
    * 에러 디테일
    * @member {String} description
    */
    description = undefined;








}


