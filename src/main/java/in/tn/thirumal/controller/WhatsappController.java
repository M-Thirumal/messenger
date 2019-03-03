/**
 * 
 */
package in.tn.thirumal.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.tn.thirumal.model.Group;
import in.tn.thirumal.service.WhatsappService;

/**
 * @author Thirumal
 * @since 03/03/2019
 * @version 1.0
 */
@RestController
@RequestMapping("/whatsapp")
public class WhatsappController {

	Logger logger = LoggerFactory.getLogger(WhatsappController.class);
	  
    private WhatsappService whatsappService;

    @Autowired
    public WhatsappController(WhatsappService whatsappService) {
		super();
		this.whatsappService = whatsappService;
	}

	//TODO: add exception handling beahviour

    @RequestMapping(value = "/createGroup", method = RequestMethod.POST)
    public ResponseEntity<String> createGroup(@RequestBody Group group) throws IOException {
    	logger.info("CreateGroupRequest received is {}", group);
        String result = whatsappService.createGroup(group);
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

/*
    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    public ServiceResponse<String> sendMessage(@RequestBody String requestBody) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        SendMessageRequest sendMessageRequest = mapper.readValue(requestBody, SendMessageRequest.class);

        LOGGER.info("SendMessageRequest received is {}",sendMessageRequest);

        String result = whatsappSenderService.sendMessage(sendMessageRequest);
        return new ServiceResponse<String>(result, HttpStatus.OK);
    }

*/
}
