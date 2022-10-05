let d = new Date();

async function myFunction() {
	return "Hello";
}
// .then will return the resolved value of the promise
myFunction().then((value) => {
	console.log(
		`${value} ${d.getHours(Date.now())}hr ${d.getMinutes(Date.now())}min!`
	);
});

let testFunction = async () => {
	let testPromise = new Promise((Resolve, Reject) => {
		if (d.getMinutes(Date.now()) % 2 == 0)
			setTimeout(() => {
				Resolve("Its! Resolved part of a promise");
			}, 3000);
		else Reject("Its! Rejected part of a promise");
	});
	/**
	 * The await expression causes async function execution to pause until
	 * a Promise is settled (that is, fulfilled or rejected), and to resume
	 * execution of the async function after fulfillment.
	 */
	let result = await testPromise;
	console.log(result);
};

testFunction();
