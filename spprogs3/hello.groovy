@Controller
class Example{
	@RequestMapping("/")
	@ResponseBody
	public String Hello()
	{
		"Hello Spring Boot"
	}
}
